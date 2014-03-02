package com.amos.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amos.service.HelloImpl;

public class testspring {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		HelloImpl hello = applicationContext.getBean(HelloImpl.class	);
		String sayHi = hello.sayHi();
		System.out.println("sayHi:"+sayHi);
	}
}
