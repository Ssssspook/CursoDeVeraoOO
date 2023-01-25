package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		float t1, t2, tarea, c1, c2, carea;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a largura do terreno: ");
		t1 = teclado.nextFloat();
		System.out.println("Digite a altura do terreno: ");
		t2 = teclado.nextFloat();
		tarea = t1*t2;
		System.out.println("Digite a largura da casa: ");
		c1 = teclado.nextFloat();
		System.out.println("Digite a altura da base casa: ");
		c2 = teclado.nextFloat();
		carea = c1*c2;
		float prcrest = ((tarea - carea)*100)/tarea;
		System.out.println("A porcentagem do terreno que ficou livre é " + prcrest +"%");
	}
}
