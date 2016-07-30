package com.yin.test.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.yin.ioc.injection.service.InjectionService;
import com.yin.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

	public TestInjection() {
		super("classpath:spring-injection.xml");
	}
	
	@Test
	public void testSetter(){
		InjectionService service = super.getBean("injectionServic");
		service.save("这是要保存的数据");
	}
	
	@Test
	public void testCons() {
		InjectionService service = super.getBean("injectionServic");
		service.save("需要保存的数据");
	}
	
}
