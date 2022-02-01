package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Stream {
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		lista.stream().forEach(e -> System.out.print(e));
		
		System.out.println("\n----------------sSkip-----------");
		
		lista.stream().skip(2).forEach(e -> System.out.print(e));
		
		
		System.out.println("\n----------------Limite-----------");
		
		lista.stream().limit(2).forEach(e -> System.out.print(e));
		
		System.out.println("\n----------------Distinct()-----------");
		
		lista.stream().distinct().forEach(e -> System.out.print(e));
		
		System.out.println("\n----------------Filter()-----------");
				
				lista.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e));
				
		System.out.println("\n----------------Map()-----------");
						
						lista.stream().map(e -> e * 2).forEach(e -> System.out.println(e));
		
System.out.println("\n----------------Map()&limite()-----------");
						
						lista.stream().limit(3).map(e -> e * 2).forEach(e -> System.out.println(e));
						
				System.out.println("\n----------------count-----------");
										
				long count = lista.stream().map(e -> e * 2).count();
				System.out.println(count);
				
				
				System.out.println("\n----------------count Pares-----------");
				
				long count1 = lista.stream().filter(e -> e % 2 == 0).count();
				System.out.println(count1);
				
				System.out.println("\n----------------min Comparator-----------");
				
				//o Max é parecido
				
			    Optional<Integer> min =	lista.stream().filter(e -> e % 2 == 0).min(Comparator.naturalOrder());
				
			    System.out.println(min.get());
			    
			    System.out.println("------Collect pares ------");
			    List<Integer> novaLista = lista.stream().filter(e -> e % 2 == 0)
			    		.collect(Collectors.toList());
			    System.out.println(novaLista);
			    
			    System.out.println("------Collect groupingBy ------");
			    Map<Boolean, List<Integer>> mapa = lista.stream().map(e -> e * 3)
			    		.collect(Collectors.groupingBy(e -> e % 2 == 0));
			    System.out.println(mapa);
			    
			    System.out.println("------Collect joining ------");
			    String collect = lista.stream().map(e -> String.valueOf(e))
			    		.collect(Collectors.joining());
			    System.out.println(collect);

			    
	}
	


}
