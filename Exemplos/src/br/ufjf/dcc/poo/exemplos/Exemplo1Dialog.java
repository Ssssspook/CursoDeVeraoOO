package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo1Dialog {
	public static void main(String[] args) {
		String nomeUsuario;
		nomeUsuario = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Olá, "+ nomeUsuario);
	}
}
