package com.irfan.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/irfan/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages countriesandlangs = (CountriesAndLanguages) context.getBean("countriesandlangs");
		System.out.println(countriesandlangs);

	}
}
