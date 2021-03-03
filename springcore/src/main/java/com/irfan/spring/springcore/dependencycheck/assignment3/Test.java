package com.irfan.spring.springcore.dependencycheck.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/irfan/spring/springcore/dependencycheck/assignment3/config.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);
		
		University university2 = (University) context.getBean("university");
		System.out.println(university2);
	}
}
