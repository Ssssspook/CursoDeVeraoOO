package br.ufjf.dcc.poo.exemplos;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String[3];
		float notas[] = new float[3];
		float media = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do " + (i+1) + " aluno: ");
			nomes[i] = teclado.nextLine();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a nota do " + (i+1) + " aluno: ");
			notas[i] = teclado.nextFloat();
			media = media + notas[i];
		}
		media = media / 3;
		
		for(int i = 0; i<3; i++) {
			if (notas[i] > media)
				System.out.println("Parabéns, " + nomes[i]);
		}
	}
}
