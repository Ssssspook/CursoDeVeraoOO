package br.ufjf.dcc.poo.exercicio22;

public class Conta {
	private String titular;
	private int num;
	private String agencia;
	private double saldo;
	private String data;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void saca(double valor) {
		double saldo = getSaldo();
		if(saldo < valor) {
			System.out.println("Saldo insuficiente!");
		}
		else if (saldo > valor) {
			setSaldo(saldo - valor);
			System.out.println("Valor sacado. Novo saldo: " + getSaldo());
		}
	}
	
	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("Valor depositado! Novo saldo: " + getSaldo());
	}
	
	public void rendimentoMensal() {
		double saldo = getSaldo() + getSaldo()*0.1;
		System.out.println("O rendimento mensal da conta é "+ saldo);
	}
	
}
