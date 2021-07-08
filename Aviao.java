package pooGenerationLista5Exercicios;
/* 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Aviao {
	private String modeloAviao;
	private String paisAviao;
	private int ano;
	
	public Aviao (String modelo, String pais, int ano) {
		this.modeloAviao = modelo;
		this.paisAviao = pais;
		this.ano = ano;
		
		
	}
	
	public Aviao (String modelo) {
		this.modeloAviao = modelo;
		}
	
	public void imprimirInfo() {
		System.out.println("\nModelo do Avi�o: " + modeloAviao + " \nPais: " + paisAviao + " \nAno: " + ano);
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public String getPaisAviao() {
		return paisAviao;
	}

	public void setPaisAviao(String paisAviao) {
		this.paisAviao = paisAviao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}





