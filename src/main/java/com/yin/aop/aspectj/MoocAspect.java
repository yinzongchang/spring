package com.yin.aop.aspectj;

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
	
	@Before("execution(* com.yin.aop.aspectj.biz.*Biz.*(..))")
	public void before() {
		System.out.println("Before...");
	}

}
