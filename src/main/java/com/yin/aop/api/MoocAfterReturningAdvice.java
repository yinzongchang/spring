package com.yin.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MoocAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		
		System.out.println("MoocAfterReturnAdvice : " + arg1.getName() + "   " + arg3.getClass().getName() + "   " + arg0);
		
	}

}
