package examples;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList listaSemParametrizacao = new ArrayList();
		listaSemParametrizacao.add(12);
		listaSemParametrizacao.add("java");
		listaSemParametrizacao.add(Boolean.FALSE);
		
		System.out.println(listaSemParametrizacao);
		// Ela vai fucinonar como se estivesse recebendo Object
		
		
		//Dessa forma, não:
		ArrayList<Integer> listaDeInteiros = new ArrayList<>();
		
		// add - adiciona um elemento no final da lista
		listaDeInteiros.add(1);
		listaDeInteiros.add(2);
		
		System.out.println("add: " + listaDeInteiros);
		
		// add(index) -  adiciona um elemento na lista em posição especifica
		// 				...desde que essa posição seja (no maximo) uma a mais do maximo indice da lista
		listaDeInteiros.add(2, 3);
		
		System.out.println("add(indez): " + listaDeInteiros);
		
	}
}
