package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio03 {

	public static void main(String[] args) {
		float a, b, c, d, x1, x2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o coeficiente a: ");
		a = teclado.nextFloat();
		System.out.println("Digite o coeficiente b: ");
		b = teclado.nextFloat();
		System.out.println("Digite o coeficiente c: ");
		c = teclado.nextFloat();
		d = (b*b)-(4*a*c);
		x1 = (float) ((-(b) + Math.sqrt(d))/(2*a));
		x2 = (float) ((-(b) - Math.sqrt(d))/(2*a));
		
		System.out.println("x1 = "+ x1 +" e x2 = "+ x2);
	}

}
