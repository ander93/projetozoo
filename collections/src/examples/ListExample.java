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
		listaDeInteiros.add(5);
		listaDeInteiros.add(99);
		
		System.out.println("add: " + listaDeInteiros);
		
		// add(index) -  adiciona um elemento na lista em posição especifica
		// 				...desde que essa posição seja (no maximo) uma a mais do maximo indice da lista
		listaDeInteiros.add(2, 14);
		
		System.out.println("add(indez): " + listaDeInteiros);
		
		int quantidade = listaDeInteiros.size();
		System.out.println("size: " + quantidade);
		
		listaDeInteiros.clear();
		quantidade = listaDeInteiros.size();
		System.out.println("Clear: " + quantidade);
		
		listaDeInteiros.add(10);
		listaDeInteiros.add(11);
		listaDeInteiros.add(12);
		
		boolean resultado = listaDeInteiros.contains(12);
		System.out.println("contains(obj): " + resultado);
		
		boolean foiRemovido = listaDeInteiros.remove(Integer.valueOf(11));
		System.out.println("remove(obj): " + listaDeInteiros);
		System.out.println("removido?  " + foiRemovido);
		
		Integer itemRemovido = listaDeInteiros.remove(0);
		System.out.println("remove(obj): " + listaDeInteiros);
		System.out.println("removido: " + itemRemovido);		
		
		Integer elementoQueEstavaLaAntes = listaDeInteiros.set(0, 32);
		System.out.println("set(index, obj): " + listaDeInteiros);
		System.out.println("elementoQueEstavaLaAntes: " + elementoQueEstavaLaAntes);	
		
		listaDeInteiros.add(10);
		listaDeInteiros.add(11);
		listaDeInteiros.add(12);
		
		Integer elementoQueEstaNoIndice = listaDeInteiros.get(1);
		System.out.println("elementoQueEstaNoIndice: " + elementoQueEstaNoIndice);
		
		int index = listaDeInteiros.indexOf(11);
		System.out.println("listaDeInteiros: " + listaDeInteiros);
		System.out.println("index: " + index);
		
		ArrayList<Integer> outraLista = new ArrayList<>();
		outraLista.add(100);
		outraLista.add(99);
		outraLista.add(98);
		
		listaDeInteiros.addAll(outraLista);
		
		System.out.println("listaDeInteiros com outraLista: " + listaDeInteiros);
		
		
		
		
		
	}
}
