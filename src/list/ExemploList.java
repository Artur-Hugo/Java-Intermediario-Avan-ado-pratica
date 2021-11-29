package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("João");
		
		System.out.println(nomes);
		
		nomes.set(2, "Larissa");
		
		Collections.sort(nomes);
		
		nomes.set(2, "Wesley");
		//Adiciona wesley na posição 2 e aloca a Larissa na posição 3
		
		
		System.out.println(nomes);
		
		//nomes.remove("Wesley");
		
		//nomes.remove(2);
		
		int posicao = nomes.indexOf("Wesley");
		
		String pego = nomes.get(1);
		
		int tamanho = nomes.size();
		
		boolean temAnderson = nomes.contains("Anderson");
		
		boolean ListaEstaVazia = nomes.isEmpty();
		
		for(String nomeDoItem: nomes) {
			System.out.println("-->" + nomeDoItem);
		}
		
		Iterator<String> iterator = nomes.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println("---->" + iterator.next());
			
		}
		
		
		//Limpar tudo: nomes.clear();
		
		
		
	}
}
