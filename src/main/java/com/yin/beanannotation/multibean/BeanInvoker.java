package com.yin.beanannotation.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {

	@Autowired
	private List<BeanInterface> list;

	@Autowired
	private Map<String, BeanInterface> map;

	@Autowired
	@Qualifier("beanImplTwo")
	private BeanInterface beanInterface;

	public void say() {
		if (list != null && list.size() != 0) {
			System.out.println("-----list-----");
			for (BeanInterface bean : list) {
				System.out.println(bean.getClass().getName());
			}
		} else {
			System.out.println("List<BeanInterface>list is null!!!");
		}

		if (map != null && map.size() != 0) {
			System.out.println("-----map-----");
			for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue().getClass().getName());
			}
		} else {
			System.out.println("Map<String,BeanInterface> is null!!!");
		}

		System.out.println("----------");
		if (beanInterface != null) {
			System.out.println(beanInterface.getClass().getName());
		} else {
			System.out.println("beanInterface is null!!!");
		}
	}
}
