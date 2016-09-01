package com.yin.aop.aspectj.biz;

import org.springframework.stereotype.Service;

import com.yin.aop.aspectj.MoocMethod;

@Service
public class MoocBiz {
	
	@MoocMethod("MoocBiz save MoocMethod")
	public String save(String arg) {
		System.out.println("MoocBiz save: " + arg);
//		throw new RuntimeException("Savefailed!");
		return "Save success!!!";
	}

}
