package com.irfan.spring.springcore.constructorinjection;

public class Employee {
	private int id;
	private Address address;

	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, address=%s]", id, address);
	}

}
