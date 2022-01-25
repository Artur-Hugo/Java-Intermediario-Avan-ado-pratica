package set;

public class Exemplo_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementa��o que aprendemos
			//java.util.HashSet
			//java.util.TreeSet
			//java.util.LinkedHashSet
		
		//Por padr�o, n�o garante ordem
		
		//N�o permite itens repetidos
		
		//Permite adi��o e remo��o normalmente. N�p possui busca por item e atualiza��o.
		//Para leitura, apenas navega��o.
		
		//N�o Permite mudan�a de ordena��o
		
		
		
		/*
		 * HASHSET
		 * 
		 * QUANDO UTILIZAR:
		 * Quando n�o � necess�rio manter uma ordena��o.
		 * 
		 * ORDENA��O:
		 * N�o � ordenado, e n�o permite valores repetidos.
		 * 
		 * 
		 * PERFORMANCE:
		 * Por n�o ter repeti��o de valores e n�o ser ordenado, � a implementa��o
		 * mais perform�tica
		 * */
		
		/*
		 * LinkedHashSet:
		 * 
		 * QUANDO UTILIZAR:
		 * Quando � necess�rio manter a ordem de inser��o dos elementos.
		 * 
		 * ORDENA��O:
		 * Mant�m a ordem de inser��o dos elementos
		 * 
		 * 
		 * PERFORMANCE:
		 * � a implementa��o mais lenta por ser necess�ria manter a ordem.
		 * */
		
		
		/*TREESET
		 * 
		 * QUANDO UTILIZAR:
		 * Quando � necess�rio alterar a ordem atrav�s do uso de comparators
		 * 
		 * ORDENA��O:
		 * Mant�m ordem e pode ser reordenado.
		 * 
		 * PERFORMANCE:
		 * E perform�tico para leitura. Para modifica��o tem a necessidade de 
		 * reordenar, sendo mais lento que o LinkedHashSet
		 * 
		 * */
		

	}

}
