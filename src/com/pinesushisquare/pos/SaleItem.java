package com.pinesushisquare.pos;

public class SaleItem {
	
	String name;
	int count;
	double price, discount;
	
	
	public SaleItem(String name, double price, int count, double discount){
		this.name = name;
		this.price = price;
		this.count = count;
		this.discount = discount;
	}

}
