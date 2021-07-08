package pooGenerationLista5Exercicios;

public class Empregado {
	private String nome;
	private double salario;
	
	public Empregado(String n, double s) {
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100; //*= --> salario = salario * 1 + percentual/100
		
	}

}
