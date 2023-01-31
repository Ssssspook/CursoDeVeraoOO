package br.ufjf.dcc.poo.exercicio21;

public class Aluno {
	private String nome;
	private String matricula;
	private float nota1, nota2, notat;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNotat() {
		return notat;
	}

	public void setNotat(float notat) {
		this.notat = notat;
	}

	public float media() {
		return (this.nota1+this.nota2+this.notat)/3;
	}
	
	public String resultadoFinal() {
		String retorno = "";
		float media = (this.nota1+this.nota2+this.notat)/3;
		if(media>=4 && media < 6)
			retorno = "FINAL";
		if(media<4)
			retorno = "REPROVADO";
		if(media >= 6)
			retorno = "APROVADO";
		return retorno;
	}
	
}
