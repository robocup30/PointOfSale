package com.pinesushisquare.pos;

import java.awt.*;
import java.awt.print.PrinterException;
import java.io.File;

import javax.print.*;
import javax.swing.*;

public class Startup extends JFrame{
	
	FlowLayout flo;
	SalePanel salePanel = new SalePanel();
	ItemPanel itemPanel = new ItemPanel();
	
	public Startup(){
		
		super("Pine Sushi Square POS");
		setLookAndFeel();
		setExtendedState(MAXIMIZED_BOTH);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flo = new FlowLayout();
		setLayout(flo);
		setJMenuBar(null);
		add(itemPanel);
		add(salePanel);
		
		setVisible(true);
	}

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
            		"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
    
	public static void main(String args[]){
		Startup start = new Startup();
	}
    
    
}
