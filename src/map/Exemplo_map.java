package map;

import java.util.HashMap;
import java.util.Map;

public class Exemplo_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> campeoesMundialFifa = new HashMap<>();
		
		// Adiciona os campeôes mundias fifa no mapa
		campeoesMundialFifa.put("Brasil", 5);
		campeoesMundialFifa.put("Alemanha", 4);
		campeoesMundialFifa.put("Italia", 4);
		campeoesMundialFifa.put("Uruguai", 2);
		campeoesMundialFifa.put("Argentina", 2);
		campeoesMundialFifa.put("França", 2);
		campeoesMundialFifa.put("Inglaterra", 1);
		campeoesMundialFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundialFifa);
		
		//Atualiza o valor para a chave Brasil
		campeoesMundialFifa.put("Brasil", 6);
		
		System.out.println(campeoesMundialFifa);
		
		// Retorna a Argentina
		System.out.println(campeoesMundialFifa.get("Argentina"));
		
		// Retorna se existe ou não um campeão França
		System.out.println(campeoesMundialFifa.containsKey("França"));
		
		// Retorna se existe ou não alguma seleção hexa campeã
		System.out.println(campeoesMundialFifa.containsValue(6));
		
		// Retorna o tamanho do mapa
		System.out.println(campeoesMundialFifa.size());
		
		System.out.println(campeoesMundialFifa);
		
		// Navega nos registros do mapa
		for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		// Navega nos registros do mapa
		for(String key : campeoesMundialFifa.keySet()) {
			System.out.println(key + " -- " + campeoesMundialFifa.get(key));
		}
		
		System.out.println(campeoesMundialFifa);
		
		// Verifica se o mapa contem a chave Estados Unidos
		System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

		// Verifica se o mapa contem o valor 5
		System.out.println(campeoesMundialFifa.containsValue(5));
		
		
	}

}
