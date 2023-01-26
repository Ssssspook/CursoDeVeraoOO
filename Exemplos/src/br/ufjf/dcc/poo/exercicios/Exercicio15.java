package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		int ini, fim;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de início: ");
		ini = teclado.nextInt();
		System.out.println("Digite o valor de fim: ");
		fim = teclado.nextInt();
		for(int i = ini; i < fim; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(fim);
	}

}
