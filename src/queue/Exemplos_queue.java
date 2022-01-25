package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplos_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementa��es que aprendemos
		//Java.Util.LinkedList
		//Garante ordem de inser��o
		//Permite adi��o, leitura e remo��o considerando a regra b�sica de uma fila: Primeiro que entra, primeiro que sai.
		
		//N�o permite mudan�a de ordena��o
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Pamela");
		filaBanco.add("Patr�cia");
		filaBanco.add("Roberto");
		filaBanco.add("Fl�vio");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		
		//Deleta o primeiro
		String clienteASerAtendido = filaBanco.poll();
		
		System.out.println(clienteASerAtendido);
		
		System.out.println(filaBanco);
		
		String primeiroCliente = filaBanco.peek();
		
		System.out.println(primeiroCliente);
		
		System.out.println(filaBanco);

		String primeiroClienteOuErro = filaBanco.element();
		
		System.out.println(primeiroClienteOuErro);
		
		System.out.println(filaBanco);
		
		for (String client: filaBanco) {
			System.out.println(client);
		}
		
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		
		while (iteratorFilaBanco.hasNext()) {
			System.out.println("---->" + iteratorFilaBanco.next());
		}
		
		System.out.println(filaBanco.size());
		
		System.out.println(filaBanco.isEmpty());
		
		
	}

}
