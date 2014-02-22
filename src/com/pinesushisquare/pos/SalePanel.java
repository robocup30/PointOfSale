package com.pinesushisquare.pos;

import java.awt.Color;

import javax.swing.JPanel;

public class SalePanel extends JPanel{
	
	
	
	public SalePanel(){
		
		
		add(new SaleItemButton("California Roll", 4299, Color.RED));
		add(new SaleItemButton("Yam Roll", 1999, Color.GREEN));
		add(new SaleItemButton("Dynamite Roll", 7299, Color.BLUE));
		
	}
	

}
