package com.yin.aop.schema.advice.biz;

public class FitImpl implements Fit {

	@Override
	public void filter() {
		System.out.println("FitImpl filter");
	}

}
