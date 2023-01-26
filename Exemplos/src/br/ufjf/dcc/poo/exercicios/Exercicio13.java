package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		int num, media = 0, cont = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor (-1 para sair): ");
		num = teclado.nextInt();
		while(num != -1) {
			media = media + num;
			cont++;
			System.out.println("Digite um valor (-1 para sair): ");
			num = teclado.nextInt();
		}
		System.out.println("A média dos valores lidos é "+ media/cont);
	}

}
