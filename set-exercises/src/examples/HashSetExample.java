package examples;

import java.util.HashSet;

public class HashSetExample {
	
			public static void main(String[] args) {
				HashSet<String> nomes = new HashSet<>();
				System.out.println(nomes.add("Cesar"));
				System.out.println(nomes.add("Fulano"));
				System.out.println(nomes.add("Ciclano"));
				System.out.println(nomes.add("Beltrano"));
				
				System.out.println(nomes.add("nomes"));
				
				System.out.println(nomes.add("Cesar"));
				
				nomes.add("João");
				nomes.add("Maria");
				
				System.out.println(nomes);
				
				
				
			}
}
