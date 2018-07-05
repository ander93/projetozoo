package examples;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<String, Double> acoesEmpresas = new HashMap<>();
		acoesEmpresas.put("Apple", new Double(91.98));
		acoesEmpresas.put("Sony", new Double(16.76));
		acoesEmpresas.put("Dell", new Double(30.67));
		acoesEmpresas.put("HP", new Double(33.91));
		acoesEmpresas.put("IBM", new Double(181.71));
	
		System.out.println("Conteudo do Hashmap: " + acoesEmpresas);
	
		for (String chave : acoesEmpresas.keySet() ) {
			System.out.println(chave + ":\t " + acoesEmpresas.get(chave));
			
			
			
			
		}
		
		System.out.println("\nO pre�o do a��o da HP �: " + acoesEmpresas.get("HP"));
		
		System.out.println("\nO tamanho do mapa �: " + acoesEmpresas.size());
		
		System.out.println("\nO o mapa est� vazio?  " + acoesEmpresas.isEmpty());
		
		System.out.println("\nO mapa possui a chave Dell? " + acoesEmpresas.containsKey("Dell"));
		System.out.println("\nO Alguma empresa possui a��o de valor 99.99? " + acoesEmpresas.containsValue("99.99"));
		
		System.out.println("\n Remover Dell:  " + acoesEmpresas.remove("Dell"));
		System.out.println("\n Estado do mapa: " + acoesEmpresas);
		
		acoesEmpresas.clear();
		System.out.println("\n Conte�do do mapa ap�s \"clear\":" + acoesEmpresas);
		
	
	}
	
	
	
	
	
}
