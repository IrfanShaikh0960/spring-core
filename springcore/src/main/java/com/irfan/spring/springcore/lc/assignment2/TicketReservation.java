package com.irfan.spring.springcore.lc.assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside Initialize() method");
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("Inside cleanup() method");
	}

	@Override
	public String toString() {
		return String.format("TicketReservation [id=%s]", id);
	}

}
