package com.yin.ioc.injection.service;

import com.yin.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;
	
	public InjectionServiceImpl() {
	}

	// 构造器注入
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	// 设值注入
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {
		// 模拟业务操作
		System.out.println("Service接收参数： " + arg);
		arg = arg + ":" + this.hashCode();

		injectionDAO.save(arg);
	}

}
