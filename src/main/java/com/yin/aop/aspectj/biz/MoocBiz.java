package com.yin.aop.aspectj.biz;

import org.springframework.stereotype.Service;

@Service
public class MoocBiz {
	
	public String save(String arg) {
		System.out.println("MoocBiz save: " + arg);
		return "Save success!!!";
	}

}
