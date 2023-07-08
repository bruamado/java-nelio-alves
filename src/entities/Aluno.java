package entities;

public class Aluno {
	private String nome;
	private double[] notas = new double[2];
	
	public Aluno(String nome, double semestre1, double semestre2) {
		this.nome = nome;
		this.notas[0] = semestre1;
		this.notas[1] = semestre2;
	}
	
	public Aluno (String nome) {
		this.nome = nome;
		this.notas[0] = 0.0;
		this.notas[1] = 0.0;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double semestre1) {
		notas[0] = semestre1;
	}
	
	public void setNotas(double semestre1, double semestre2) {
		notas[0] = semestre1;
		notas[1] = semestre2;
	}
	
}
