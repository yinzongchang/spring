package com.yin.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MoocMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		
		System.out.println("MoocMethodInterceptor: " + arg0.getMethod().getName() + "   " + arg0.getStaticPart().getClass().getName());
		Object obj = arg0.proceed();
		
		System.out.println("MoocMethodInterceptor2: " + obj);
		return obj;
		
	}

}
