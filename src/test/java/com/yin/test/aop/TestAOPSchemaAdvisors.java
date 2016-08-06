package com.yin.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.yin.aop.schema.advisors.service.InvokeService;
import com.yin.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvisors extends UnitTestBase {

	public TestAOPSchemaAdvisors() {
		super("classpath:spring-aop-schema-advisors.xml");
	}

	@Test
	public void testSave() {
		InvokeService service = super.getBean("invokeService");
		service.invoke();

		System.out.println("------");
		service.invokeException();
	}

}
