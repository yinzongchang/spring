package com.yin.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MoocAspect {
	@Pointcut("execution(* com.yin.aop.aspectj.biz.*Biz.*(..))")
	public void pointcut() {
		
	}
	
	@Pointcut("within(com.yin.aop.aspectj.biz.*)")
	public void bizPointcut() {
		
	}
	
//	@Before("execution(* com.yin.aop.aspectj.biz.*Biz.*(..))")
	@Before("pointcut()")
	public void before() {
		System.out.println("Before...");
	}
	
	@Before("pointcut() && args(arg)")
	public void beforeWithParam(String arg) {
		System.out.println("Before: " + arg);
	}
	
	@Before("pointcut() && @annotation(moocMethod)")
	public void beforeWithAnnotaion(MoocMethod moocMethod) {
		System.out.println("BeforeWithAnnotain.: " + moocMethod.value());
	}
	
	@AfterReturning(pointcut="bizPointcut()", returning="returnVal")
	public void afterReturning(Object returnVal) {
		System.out.println("AfterReturning: " + returnVal);
	}
	
	@AfterThrowing(pointcut="pointcut()", throwing="e")
	public void afterThrowing(RuntimeException e) {
		System.out.println("AfterThrow: " + e.getMessage());
	}
	
	@After("pointcut()")
	public void after() {
		System.out.println("After...");
	}
	
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around 1 .");
		Object obj = pjp.proceed();
		System.out.println("Around 2 .");
		System.out.println("Around: " + obj);
		return obj;
	}

}
