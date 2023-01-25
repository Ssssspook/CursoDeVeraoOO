package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		int km, gas;
		km = Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem: ", null));
		gas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantia de gasolina em litros: ", null));
		JOptionPane.showMessageDialog(null,"O consumo será "+ km/gas + " km/L", "Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

}
