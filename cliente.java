package pooGenerationLista5Exercicios;
/* Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class cliente {
	private String NomeCliente;
	private String cpfCliente;
	private String telCliente;
	
	
	public cliente (String nome, String cpf, String telefone) {
		this.NomeCliente = nome;
		this.cpfCliente = cpf;
		this.telCliente = telefone;
		
		
	}
	
	public cliente (String nome) {
		this.NomeCliente = nome;
		}
	
	public void imprimirInfo() {
		System.out.println("\nNome: " + NomeCliente + " CPF: " + cpfCliente + " Telefone: " + telCliente);
	}

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}
	
	
	
	}


