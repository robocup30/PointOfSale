package com.pinesushisquare.pos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemPanel extends JPanel{
	
	private static ArrayList<SaleItem> items = new ArrayList<SaleItem>();
	JLabel panelLabel = new JLabel("PAN NNNNNEL");
	
	
	public ItemPanel(){
		this.setSize(new Dimension(200, 200));
		add(panelLabel);
		
	}
	
	public static void add(SaleItem itemToAdd){
		items.add(itemToAdd);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.setBackground(Color.RED);
		g2d.drawString("ADDDDD", 100, 100);
		//g2d.fillOval(10, 0, 300, 100);
		g.setColor(Color.RED);
	}
	

}
