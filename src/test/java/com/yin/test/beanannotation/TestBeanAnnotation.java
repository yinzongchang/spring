package com.yin.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.yin.beanannotation.BeanAnnotation;
import com.yin.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {

	public TestBeanAnnotation() {
		super("classpath:spring-beanannotation.xml");
	}

	@Test
	public void testSay() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.say("This is test!!!");
	}
	
	@Test
	public void testScope() {
/*		BeanAnnotation bean1 = super.getBean("beanAnnotation");
		System.out.println(bean1.hashCode());
		
		BeanAnnotation bean2 = super.getBean("beanAnnotation");
		System.out.println(bean2.hashCode());*/
		
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();
		
		bean = super.getBean("beanAnnotation");
		bean.myHashCode();
		
	}
}
