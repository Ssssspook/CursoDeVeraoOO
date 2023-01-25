package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		float a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do lado 1 do triangulo");
		a = teclado.nextFloat();
		System.out.println("Digite o valor do lado 2 do triangulo");
		b = teclado.nextFloat();
		System.out.println("Digite o valor do lado 3 do triangulo");
		c = teclado.nextFloat();
		if (Math.abs(b-c) < a && a < b+c) {
			if (Math.abs(a-c) < b && b < a+c) {
				if (Math.abs(a-b) < c && c < a+b) {
					System.out.println("O triângulo existe.");
				}
			}
		}
		else {
			System.out.println("O triângulo não existe.");
		}

	}

}
