package pooGenerationLista5Exercicios;
/* 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

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
		System.out.println("\nModelo do Avião: " + modeloAviao + " \nPais: " + paisAviao + " \nAno: " + ano);
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





