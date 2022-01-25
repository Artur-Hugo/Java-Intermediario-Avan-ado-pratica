package set;

public class Exemplo_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementação que aprendemos
			//java.util.HashSet
			//java.util.TreeSet
			//java.util.LinkedHashSet
		
		//Por padrão, não garante ordem
		
		//Não permite itens repetidos
		
		//Permite adição e remoção normalmente. Nãp possui busca por item e atualização.
		//Para leitura, apenas navegação.
		
		//Não Permite mudança de ordenação
		
		
		
		/*
		 * HASHSET
		 * 
		 * QUANDO UTILIZAR:
		 * Quando não é necessário manter uma ordenação.
		 * 
		 * ORDENAÇÂO:
		 * Não é ordenado, e não permite valores repetidos.
		 * 
		 * 
		 * PERFORMANCE:
		 * Por não ter repetição de valores e não ser ordenado, é a implementação
		 * mais performática
		 * */
		
		/*
		 * LinkedHashSet:
		 * 
		 * QUANDO UTILIZAR:
		 * Quando é necessário manter a ordem de inserção dos elementos.
		 * 
		 * ORDENAÇÂO:
		 * Mantém a ordem de inserção dos elementos
		 * 
		 * 
		 * PERFORMANCE:
		 * É a implementação mais lenta por ser necessária manter a ordem.
		 * */
		
		
		/*TREESET
		 * 
		 * QUANDO UTILIZAR:
		 * Quando é necessário alterar a ordem através do uso de comparators
		 * 
		 * ORDENAÇÂO:
		 * Mantém ordem e pode ser reordenado.
		 * 
		 * PERFORMANCE:
		 * E performático para leitura. Para modificação tem a necessidade de 
		 * reordenar, sendo mais lento que o LinkedHashSet
		 * 
		 * */
		

	}

}
