package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma idade:");
		idade = teclado.nextInt();
		if (idade <= 3) {
			System.out.println("Bebê");
		}
		else if (idade > 3 && idade <= 13) {
			System.out.println("Criança");
		}
		else if (idade > 13 && idade < 20) {
			System.out.println("Adolescente");
		}
		else if (idade >= 20 && idade < 65) {
			System.out.println("Adulto");
		}
		else if (idade >= 65) {
			System.out.println("Idoso");
		}
	}

}
