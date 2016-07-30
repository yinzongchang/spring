package com.yin.test.lifecycle;

import org.junit.Test;

import com.yin.test.base.UnitTestBase;

public class TestBeanLifecycle extends UnitTestBase {

	public TestBeanLifecycle() {
		super("classpath:spring-lifecycle.xml");
	}

	@Test
	public void test1() {

		super.getBean("beanLifeCycle");

	}
}
