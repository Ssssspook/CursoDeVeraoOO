package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2Dialog {

	public static void main(String[] args) { 
		String n1, n2;
		int num1, num2;
		n1 = JOptionPane.showInputDialog("Digite o primeiro valor: ", null);
		num1 = Integer.parseInt(n1);
		n2 = JOptionPane.showInputDialog("Digite o primeiro valor: ", null);
		num2 = Integer.parseInt(n2);
		
		JOptionPane.showMessageDialog(null,"A soma é "+ num1+num2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
