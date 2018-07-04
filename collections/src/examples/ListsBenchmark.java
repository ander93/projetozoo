package examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


	public class ListsBenchmark {
		
		public static void main(String[] args)		{
			ArrayList<Integer> arrayList = new ArrayList<>();
			LinkedList<Integer> linkedList = new LinkedList<>();
			
			// 1) adiciona no final
			long tempo = ListsBenchmark.AdicionaNoFinal(arrayList);
			System.out.println("ArrayList (final): " + tempo + " ms");
			
			tempo = ListsBenchmark.AdicionaNoFinal(linkedList);
			System.out.println("LinkedList (final): " + tempo + " ms"); 
			
			// 2) adiciona no começo
			tempo = ListsBenchmark.adicionaNoComeco(arrayList);
			System.out.println("ArrayList (começo): " + tempo + " ms");
						
			tempo = ListsBenchmark.adicionaNoComeco(linkedList);
			System.out.println("LinkedList (começo): " + tempo + " ms"); 
			
			//3)
			tempo = ListsBenchmark.get(arrayList);
			System.out.println("ArrayList (get): " + tempo + " ms");
						
			tempo = ListsBenchmark.get(linkedList);
			System.out.println("LinkedList (get): " + tempo + " ms"); 
			
			
		}
		
		
		public static long AdicionaNoFinal(List<Integer> lista) {
			long inicio = System.currentTimeMillis();
			int tamanho = 100000;
			
			for (int i = 0; i < tamanho; i++) {
				lista.add(i);
			
			}
			
			long fim = System.currentTimeMillis();
			
			return fim - inicio;
					
		}
		
		
		public static long adicionaNoComeco(final List<Integer> lista) {
			long inicio = System.currentTimeMillis();
			int tamanho = 100000;
			
			for (int i = 0; i < tamanho; i++) {
				lista.add(i);
			
			}
			
			long fim = System.currentTimeMillis();
			
			return fim - inicio;
			
		}
		
		public static long get(final List<Integer> lista) {
			
			int tamanho = 100000;
			
			for (int i = 0; i < tamanho; i++) {
				lista.add(i);
			
			}
			
			
			long fim = System.currentTimeMillis();
			for (int i = 0; i < tamanho; i++) {
			lista.get(i);
			
		
			
		}
		
		
	}
	
	}
	


