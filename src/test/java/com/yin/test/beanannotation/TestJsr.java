package com.yin.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.yin.beanannotation.jsr.JsrService;
import com.yin.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {

	public TestJsr() {
		super("classpath:*spring-beanannotation.xml");
	}

	@Test
	public void testSave() {
		JsrService service = getBean("jsrService");
		service.save();
	}
}
