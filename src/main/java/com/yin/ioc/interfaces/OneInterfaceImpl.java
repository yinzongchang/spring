package com.yin.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface {

	@Override
	public void say(String arg) {
		System.out.println("serviceImpl say:" + arg);
	}

}
