package com.irfan.spring.springcore.assignment1;

public class ShoppingCart {
	private Item items;

	public Item getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return String.format("ShoppingCart [items=%s]", items);
	}	
	
}
