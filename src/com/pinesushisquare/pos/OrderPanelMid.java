package com.pinesushisquare.pos;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class OrderPanelMid extends JPanel {
	
	public static ArrayList<SaleItem> items = new ArrayList<SaleItem>();
	
	public OrderPanelMid(){
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(20, 1));
	}
	
}
