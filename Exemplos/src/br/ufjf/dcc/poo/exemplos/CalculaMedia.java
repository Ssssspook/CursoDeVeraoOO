package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float a, b, c;
		float media;
		System.out.println("Digite o 1 valor: ");
		a = teclado.nextFloat();
		System.out.println("Digite o 2 valor: ");
		b = teclado.nextFloat();
		System.out.println("Digite o 3 valor: ");
		c = teclado.nextFloat();
		media = (a+b+c)/3;
		System.out.println("A média é " + media);
	}

}
