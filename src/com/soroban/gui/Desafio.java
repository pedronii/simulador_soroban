package com.soroban.gui;

import com.soroban.gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class Desafio extends JPanel {

	public Desafio(GUI gui) {
		super();
		setBackground(new Color(47, 79, 79));
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		JButton btnPrximo = new JButton("Próximo");
		btnPrximo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrximo.setBounds(583, 397, 183, 51);
		add(btnPrximo);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.homePanel);
			}
		});
		btnMenuPrincipal.setBounds(38, 397, 183, 51);
		add(btnMenuPrincipal);
		
		JCheckBox checkBox[][] = new JCheckBox[7][12];
		int ichidaDist = 0;
		boolean checked;
		for(int j = 0; j < 7; j++) {
			if(j > 1) {
				ichidaDist = 30;
			}
			
			if(j == 0 || (j > 1 && j < 6)) 
				checked = true;
			else 
				checked = false;
			
			for(int i = 0; i < 12; i++) {
				checkBox[j][i] = new JCheckBox("");
				checkBox[j][i].setBounds(120 + (i * 40), 70 + (j * 30) + ichidaDist, 21, 23);
				add(checkBox[j][i]);
				checkBox[j][i].setSelected(checked);
			}
		}
	}
}
