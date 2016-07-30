package com.yin.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.yin.beanannotation.javabased.MyDriverManager;
import com.yin.beanannotation.javabased.Store;
import com.yin.beanannotation.javabased.StringStore;
import com.yin.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase {

	public TestJavabased() {
		super("classpath:spring-beanannotation.xml");
	}

	@Test
	public void test() {
		Store store = super.getBean("store");
		System.out.println(store.getClass().getName());
	}

	@Test
	public void testMyDriverManager() {
		MyDriverManager myDriverManager = super.getBean("myDriverManager");
		System.out.println(myDriverManager);
	}

	@Test
	public void testScope() {
		Store store = super.getBean("store");
		System.out.println(store.hashCode());

		store = super.getBean("store");
		System.out.println(store.hashCode());

	}

	@Test
	public void testG() {
		StringStore store = super.getBean("stringStoreTest");
	}

}
