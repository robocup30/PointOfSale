package com.pinesushisquare.pos;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

public class SaleItemButton extends JButton {

	public final String name;
	public final double price;
	public final Color color;

	public SaleItemButton() {
		this("N/A", 0, Color.RED);
	}

	public SaleItemButton(String name, int price) {
		this(name, price, Color.RED);
	}

	public SaleItemButton(final String name, final double price, Color color) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.setBorderPainted(true);
		this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

		BufferedImage buffImg = null;
		try {
			buffImg = ImageIO.read(new File("cool.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Graphics2D g2 = buffImg.createGraphics();
		g2.setComposite(AlphaComposite.SrcAtop);
		g2.setColor(new Color(255, 0, 0, 100));
		g2.fillRect(0, 0, 150, 100);
		g2.setColor(Color.BLACK);
		int stringLen = (int) g2.getFontMetrics().getStringBounds(name, g2)
				.getWidth();
		int start = buffImg.getWidth() / 2 - stringLen / 2;
		g2.drawString(name, start, 23);
		ImageIcon img = new ImageIcon(buffImg);
		this.setIcon(img);

		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				ItemPanel.add(new SaleItem(name, price, 1, 0));
				BufferedImage buffImg = null;
				try {
					buffImg = ImageIO.read(new File("cool.png"));
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				Graphics2D g2 = buffImg.createGraphics();
				g2.setComposite(AlphaComposite.SrcAtop);
				g2.setColor(new Color(255, 0, 0, 50));
				g2.fillRect(0, 0, 150, 100);
				g2.setColor(Color.BLACK);
				int stringLen = (int) g2.getFontMetrics()
						.getStringBounds(name, g2).getWidth();
				int start = buffImg.getWidth() / 2 - stringLen / 2;
				g2.drawString(name, start, 23);
				ImageIcon img = new ImageIcon(buffImg);
				setIcon(img);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				BufferedImage buffImg = null;
				try {
					buffImg = ImageIO.read(new File("cool.png"));
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				Graphics2D g2 = buffImg.createGraphics();
				g2.setComposite(AlphaComposite.SrcAtop);
				g2.setColor(new Color(255, 0, 0, 100));
				g2.fillRect(0, 0, 150, 100);
				g2.setColor(Color.BLACK);
				int stringLen = (int) g2.getFontMetrics()
						.getStringBounds(name, g2).getWidth();
				int start = buffImg.getWidth() / 2 - stringLen / 2;
				g2.drawString(name, start, 23);
				ImageIcon img = new ImageIcon(buffImg);
				setIcon(img);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub


			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});
	}

}
