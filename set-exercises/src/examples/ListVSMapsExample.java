package examples;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;

public class ListVSMapsExample {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		System.out.println("=========== Adicionando à lista ============");
		TimeCounter.iniciarCronometro();
		for (int i = 0; i < 100000; i++) {
			lista.add("Item"+i);
			
				
			
		}
		
		TimeCounter.encerrarCronometro("Adição à lista");
		
		System.out.println("=========== Adicionando ao mapa ============");
		HashMap<String, Integer> mapa = new HashMap<>();
		TimeCounter.iniciarCronometro();
		for (int i = 0; i < 100000; i++) {
			mapa.put("Item"+ i, i );
		}
	
			
			String itemProcurado = "Item999999";
			
			System.out.println("========== Procurando na lista ==============");
			TimeCounter.iniciarCronometro();
			for (String item : lista) {
				if (item.equals(itemProcurado)) {
					TimeCounter.encerrarCronometro("Procurar em Lista: " + itemProcurado);
					break;
					
				}
			}
			
			System.out.println("=========== Procurando no mapa ============");
			TimeCounter.iniciarCronometro();
			mapa.get(itemProcurado);
			TimeCounter.encerrarCronometro("Procurar em mapa: " + itemProcurado);			
	
			System.out.println("========== Adicionando ao mapa c/ capacidade inicial ===========");
			ArrayList<String> ListaFixa = new ArrayList<>(1200000);
		
			TimeCounter.encerrarCronometro();
			
			
			
			
			
	}
		
	
}