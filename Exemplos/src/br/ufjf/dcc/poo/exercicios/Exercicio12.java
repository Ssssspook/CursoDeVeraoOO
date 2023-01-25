package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		int vezes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas vezes a frase deve ser impressa?");
		vezes = teclado.nextInt();
		for (int i = 0; i < vezes; i++) {
			System.out.println("Faça os exercícios novamente.");
		}

	}

}
