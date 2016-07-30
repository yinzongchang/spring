package com.yin.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component("bean")
//@Scope("prototype")
@Scope
public class BeanAnnotation {

	public void say(String arg) {
		System.out.println("BeanAnnotation: " + arg);
	}
	
	public void myHashCode() {
		System.out.println(this.getClass().toString() + this.hashCode());
	}
}
