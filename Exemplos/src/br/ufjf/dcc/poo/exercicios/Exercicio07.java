package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, numeroSorteado = (int) (Math.random() * 100);
		System.out.println("Digite um número entre 0 e 100: ");
		num = teclado.nextInt();
		if (num == numeroSorteado) {
			System.out.println("Você ganhou!!");
		}
		else if (num > numeroSorteado) {
				System.out.println("O número digitado é maior que o número sorteado.");
			}
		else if (num < numeroSorteado) {
				System.out.println("O número digitado é menor que o número sorteado.");
			}
			System.out.println(numeroSorteado);
	}

}
