package br.ufjf.dcc.poo.exercicio22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Rafael");
		conta.setSaldo(1000);
		conta.saca(500);
		conta.deposita(2000);
		conta.rendimentoMensal();
	}

}
