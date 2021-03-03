package com.irfan.spring.springcore.constructorinjection;

public class Address {
	private int hno;
	private String street;
	private String city;

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("Address [hno=%s, street=%s, city=%s]", hno, street, city);
	}

}
