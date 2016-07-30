package com.yin.autowiring;

public class AutoWiringService {

	private AutoWiringDAO autoWiringDAO;
	
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		System.out.println("constructor 构造器注入");
		this.autoWiringDAO = autoWiringDAO;
	}

	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("setter设值注入");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}
	
}
