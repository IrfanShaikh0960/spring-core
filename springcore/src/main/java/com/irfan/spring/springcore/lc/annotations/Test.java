package com.irfan.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/irfan/spring/springcore/lc/annotations/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
	
	}

}
