package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int valor, cinq, vintec, dez, cinc;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor em centavos: ");
		valor = teclado.nextInt();
		System.out.print("A menor quantidade de moedas para o valor de "+ valor +" centavos é ");
		cinq = valor/50;
		valor = valor % 50;
		vintec = valor/25;
		valor = valor % 25;
		dez = valor/10;
		valor = valor % 10;
		cinc = valor/5;
		System.out.print(cinq + " moedas de 50 centavos, "+ vintec +" moedas de 25 centavos, "+ dez +" moedas de 10 centavos e "+ cinc + " moedas de cinco centavos.");
	}

}
