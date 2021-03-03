package com.irfan.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Patient [id=%s]", id);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterProperties() method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy() method");
	}

}
