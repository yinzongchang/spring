package com.yin.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MoocBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println("MoocBeforeAdvice : " + arg0.getName() + "   " + arg2.getClass().getName());
		
	}

}
