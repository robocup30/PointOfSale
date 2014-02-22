package com.pinesushisquare.pos;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemPanel extends JPanel{
	
	public static ArrayList<SaleItem> items = new ArrayList<SaleItem>();
	JLabel panelLabel = new JLabel("PAN NNNNNEL");
	
	
	public ItemPanel(){
		
		add(panelLabel);
		
	}
	
	
	

}
