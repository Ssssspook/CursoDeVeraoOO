package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		float x1, y1, x2, y2, dist;
		x1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de X do ponto A ", null));
		y1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Y do ponto A ", null));
		x2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de X do ponto B ", null));
		y2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Y do ponto B ", null));
		dist = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		JOptionPane.showMessageDialog(null,"A distância entre os pontos é "+ dist, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
