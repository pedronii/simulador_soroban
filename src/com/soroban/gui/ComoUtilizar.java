package com.soroban.gui;

import com.soroban.gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class ComoUtilizar extends JPanel {
	
	private JButton btnComoUtilizarVoltar;

	public ComoUtilizar(GUI gui) {
		super();
		setBackground(new Color(47, 79, 79));
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		
		btnComoUtilizarVoltar = new JButton("Voltar");
		btnComoUtilizarVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gui.switchPanel(gui.homePanel);
			}
		});
		btnComoUtilizarVoltar.setBounds(42, 381, 183, 51);
		this.add(btnComoUtilizarVoltar);
		
		
		JLabel lblComoUtilizar = new JLabel("<html>O Soroban é composto de diversas colunas, cada uma representando uma unidade, dezena, centena, etc. Cada coluna, por sua vez, contém duas partes: uma em cima e outra embaixo. Na parte de cima fica uma conta por coluna, que significa, cada conta, cinco unidades numéricas, e estas contas se chamam godama porque go significa cinco e dama, peça. Na parte de baixo de cada coluna.\r\n" + 
				"<br><br>" + 
				"Assim, quando as peças ou contas superiores estão para cima, e as contas inferiores estão para baixo, o Soroban está \"zerado\". Quando movemos uma pedra da parte de baixo para cima, teremos o 1, se movermos mais um, teremos a representação do 2, e assim por diante. Para representarmos o 5, basta movermos a pedra superior, da casa numérica eleita como a casa das unidades, para cima. Apesar de parecer simples fazer cálculos com este instrumento, é necessário o aprendizado de técnicas (bastante simples, em verdade), para se conseguir realizar qualquer operação de soma, por exemplo. Depois de dominada a técnica (Shuzan ou 珠算), seu uso é muito mais rápido do que o de uma calculadora.\r\n" + 
				"<br><br>" + 
				"Para se fazer cálculos, utiliza-se fórmulas para somar e subtrair, e todos os outros cálculos, multiplicar, dividir, e tirar raiz quadrada, são realizados com as mesmas fórmulas das soma e subtração, apenas utilizadas de forma coerente com as outras operações.</html>");
		lblComoUtilizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComoUtilizar.setBounds(109, 27, 656, 325);
		this.add(lblComoUtilizar);
	}
}
