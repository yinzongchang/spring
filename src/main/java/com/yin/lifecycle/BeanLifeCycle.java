package com.yin.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
	// implements InitializingBean,DisposableBean

	public void start() {
		System.out.println("Bean start.");
	}

	public void stop() {
		System.out.println("Bean stop.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean afterPropertiesSet");
	}
}
