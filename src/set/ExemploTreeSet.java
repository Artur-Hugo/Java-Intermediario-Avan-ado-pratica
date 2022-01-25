package set;

import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		// Monta a �rvore com as capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florian�polis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da �rvore
		System.out.println(treeCapitais.first());
		
		// Retorna a �ltima capital no final da �rvore
		System.out.println(treeCapitais.last());
		
		// Retorna a primeira capital abaixo na �rvore da capital parametrizada
		System.out.println(treeCapitais.lower("Florian�polis"));
		
		// Retorna a primeira capital acima na �rvore da capital parametrizada
		System.out.println(treeCapitais.higher("Florian�polis"));
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da �rvore, removendo do set
		System.out.println(treeCapitais.pollFirst());

	}

}
