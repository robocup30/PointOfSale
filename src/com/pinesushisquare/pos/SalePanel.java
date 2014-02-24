package com.pinesushisquare.pos;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SalePanel extends JPanel{
	
	
	
	public SalePanel(){
		
		
		add(new SaleItemButton("California Roll", 42.99, Color.RED));
		add(new SaleItemButton("Yam Roll", 19.99, Color.GREEN));
		add(new SaleItemButton("Dynamite Roll", 72.99, Color.BLUE));
		
		
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}
	

}
