package com.irfan.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside Hi method");
	}

	public void bye() {
		System.out.println("Inside Bye method");
	}

	@Override
	public String toString() {
		return String.format("Patient [id=%s]", id);
	}

}
