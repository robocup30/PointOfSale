package com.pinesushisquare.pos;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class SaleItem extends JLabel{
	
	String name;
	int count;
	double price, discount;
	
	
	public SaleItem(String name, double price, int count, double discount){
		this.name = name;
		this.price = price;
		this.count = count;
		this.discount = discount;
<<<<<<< HEAD
		this.setText("  " + count + "  " + name + "    $ " + price);
=======
		this.setText(name + price + count + "sam");
>>>>>>> c2c7c9418ac7ed267b1cfb4419eae77077c27443
	}

}
