package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exemplo_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		// Adiciona os numeros no set
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		
		System.out.println(sequenciaNumerica);
		
		// Remove o n�mero do set
		sequenciaNumerica.remove(4);
		
		System.out.println(sequenciaNumerica);
		
		//Retorna a quantidade de itens do set
		System.out.print(sequenciaNumerica.size());
		
		// Navega em todos os itens do iterator
		Iterator<Integer> iterator = sequenciaNumerica.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(Integer numero: sequenciaNumerica) {
			System.out.println(numero);
		}
	
	}

}
