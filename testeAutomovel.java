package pooGenerationLista5Exercicios;

public class testeAutomovel {

	public static void main(String[] args) {
		// instanciando um objeto da classe automovel
		
		Automovel auto1 = new Automovel("\nThiago Pedroso", "Pajero", "TPS-2022", 2021);
		
		//troca de mensagens (chamada ao met�do imprimirInfo()
		
		auto1.imprimirInfo();
		System.out.println("\n**** transferencia de propriet�rio***");
		auto1.setNomeProprietario("\nThiagao da Generation");
		auto1.imprimirInfo();
		
		
		System.out.println("\n**** Pr�ximo Cliente***");
		
		//outro matodo
		Automovel auto2 = new Automovel("\nBarbara Amaral", "Ferrari 458", "bab2003", 2020);
		auto2.imprimirInfo();
		System.out.println("\n**** troca de placa***");
		auto2.setPlaca("Babi2021");
		auto2.imprimirInfo();	

	}

}
