package com.irfan.spring.springcore.lc.assignment2;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/irfan/spring/springcore/lc/assignment2/config.xml");
		TicketReservation ticketreservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(ticketreservation);
		context.registerShutdownHook();
	
	}

}
