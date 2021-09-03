package com.soroban.gui;

import com.soroban.gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;

public class Passos extends JPanel {
	
	private JButton btnVoltar;

	public Passos(GUI gui) {
		super();
		setBackground(new Color(47, 79, 79));
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.voltarPasso();
			}
		});
		btnVoltar.setBounds(42, 397, 183, 51);
		this.add(btnVoltar);
		
		JTextPane txtpnPlaceholder = new JTextPane();
		txtpnPlaceholder.setText("PlaceHolder");
		txtpnPlaceholder.setBounds(158, 106, 488, 261);
		add(txtpnPlaceholder);
		
		JButton btnPrximo = new JButton("Próximo");
		btnPrximo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(gui.proxPasso() == -1) {
					gui.switchPanel(gui.calculoFinalPanel);
				}
			}
		});
		btnPrximo.setBounds(585, 397, 183, 51);
		add(btnPrximo);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.homePanel);
			}
		});
		btnMenuPrincipal.setBounds(42, 27, 183, 51);
		add(btnMenuPrincipal);
		
		JButton btnPularParaO = new JButton("Pular p/ Final");
		btnPularParaO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.calculoFinalPanel);
			}
		});
		btnPularParaO.setBounds(585, 25, 183, 51);
		add(btnPularParaO);
	}
}
