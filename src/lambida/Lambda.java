package lambida;

public class Lambda {

	public static void main(String[] args) {
		
		System.out.println("=== Inicio do teste ===");
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Mensagem");
			}
		};
		
		
		Runnable r2 = () -> System.out.println("Mensagem2");
	
		r1.run();
		r2.run();
	}
}
