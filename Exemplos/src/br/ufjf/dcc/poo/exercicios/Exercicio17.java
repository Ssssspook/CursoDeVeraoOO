package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		int num = 0, cont = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número (-1 para sair): ");
		num = teclado.nextInt();
		while(num != -1) {
			if(num%2 != 0) {
				cont++;
			}
			System.out.println("Digite outro número (-1 para sair): ");
			num = teclado.nextInt();
		}
		System.out.println(cont + " números são ímpares.");
	}

}
