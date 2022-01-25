package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo_map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> treeCapitais = new TreeMap<>();
		
		// Monta a �rvore com as capitais
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florian�polis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "S�o Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("BH", "Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da �rvore
		System.out.println(treeCapitais.firstKey());
		
		// Retorna a �ltima capital no final da �rvore 
		System.out.println(treeCapitais.lastKey());
		
		// Retorna a primeira capital abaixo na �rvore da capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));
		
		// Retorna a primeira capital acima na �rvore da capital parametrizada
		System.out.println(treeCapitais.higherKey("SC"));
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da �rvore
		System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

		// Retorna a �ltima capital no final da �rvore
		System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		// Navega em todas as chaves do iterator
		Iterator<String> iterator = treeCapitais.keySet().iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " - " + treeCapitais.get(key));
		}
		
		for(String capital : treeCapitais.keySet()) {
			System.out.println(capital + " - " + treeCapitais.get(capital));
		}
		
		for(Map.Entry<String, String> capital: treeCapitais.entrySet()) {
			System.out.println(capital.getKey() + " --)))" + capital.getValue());
		}
	}

}
