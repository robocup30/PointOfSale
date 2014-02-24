package com.pinesushisquare.pos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrderPanel extends JPanel {

	public static JLabel topLabel = new JLabel("Reset All");
	public static JPanel topPanel = new JPanel();
	public static OrderPanelMid midPanel = new OrderPanelMid();
	public static JPanel botPanel = new JPanel();

	public OrderPanel() {
		this.setPreferredSize(new Dimension(400, 900));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());
		topPanel.add(topLabel);
		this.add(topPanel, BorderLayout.NORTH);
		this.add(midPanel, BorderLayout.CENTER);
		this.add(botPanel, BorderLayout.SOUTH);
	}

	public static void add(SaleItem itemToAdd) {
		//items.add(itemToAdd);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

}
