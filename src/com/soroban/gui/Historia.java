package com.soroban.gui;

import com.soroban.gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Historia extends JPanel {
	
	private JButton btnHistoriaVoltar;

	public Historia(GUI gui) {
		super();
		setBackground(new Color(47, 79, 79));
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		btnHistoriaVoltar = new JButton("Voltar");
		btnHistoriaVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.homePanel);
			}
		});
		btnHistoriaVoltar.setBounds(42, 381, 183, 51);
		this.add(btnHistoriaVoltar);
		
		
		JLabel lblHistoriaSoroban = new JLabel("<html>Soroban (\u305D\u308D\u3070\u3093 em hiragana) \u00E9 o \u00E1baco japon\u00EAs, que consiste em um instrumento para c\u00E1lculo, originalmente chin\u00EAs, e levado para o Jap\u00E3o em torno de 1600 d.C.. \u00C9 um instrumento utilizado at\u00E9 hoje, no Jap\u00E3o e em outras partes da \u00C1sia. Ainda no Jap\u00E3o, o seu ensino \u00E9 realizado para crian\u00E7as a partir dos 5 anos de idade, e para poder se trabalhar na maior parte dos escrit\u00F3rios por l\u00E1, \u00E9 necess\u00E1rio possuir uma certifica\u00E7\u00E3o, pelo menos no grau tr\u00EAs, o menor . O seu treinamento \u00E9 realizado com o instrumento e sem o uso dele tamb\u00E9m. A repeti\u00E7\u00E3o dos exerc\u00EDcios levam o treinando a um n\u00EDvel em que consegue realizar os c\u00E1lculos mentalmente.</html>");
		lblHistoriaSoroban.setBounds(178, 27, 587, 325);
		this.add(lblHistoriaSoroban);
	}
}
