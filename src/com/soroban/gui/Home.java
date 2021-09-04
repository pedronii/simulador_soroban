package com.soroban.gui;

import com.soroban.gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

public class Home extends JPanel {
	private JButton btnHomeHistoria;

	public Home(GUI gui){
		super();
		setBackground(new Color(47, 79, 79));
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		btnHomeHistoria = new JButton("Hist\u00F3ria");
		btnHomeHistoria.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.historiaPanel);
			}
		});
		btnHomeHistoria.setBounds(486, 331, 254, 88);
		this.add(btnHomeHistoria);
		
		JButton btnHomeUtilizar = new JButton("Utilizar");
		btnHomeUtilizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.utilizarPanel);
			}
		});
		btnHomeUtilizar.setBounds(60, 212, 254, 88);
		this.add(btnHomeUtilizar);
		
		JButton btnHomeComoUtilizar = new JButton("Como Utilizar");
		btnHomeComoUtilizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.comoUtilizarPanel);
			}
		});
		btnHomeComoUtilizar.setBounds(60, 331, 254, 88);
		this.add(btnHomeComoUtilizar);
		
		JButton btnDesafio = new JButton("Desafio");
		btnDesafio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.desafioPanel);
			}
		});
		btnDesafio.setBounds(486, 212, 254, 88);
		add(btnDesafio);
	}
}
