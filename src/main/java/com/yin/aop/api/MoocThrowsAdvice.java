package com.yin.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MoocThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("Mooc ThrowsAdvice afterThrowing 1 ");
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		System.out.println("Mooc ThrowsAdvice afterThrowing 2 " + method.getName() + "   " + target.getClass().getName());
	}
	
}
