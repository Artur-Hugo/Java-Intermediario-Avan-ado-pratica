package interfaces;

public class Interface {
	//Interface funcional
	interface Num{
		double getValue();
	}
	
	interface ValorNumerico{
		boolean teste(int n);
	}
	
	interface ValorNumerico2{
		boolean teste2(int n1, int n2);
	}

	public static void main(String[] args) {
	
		Num n;
		n = () -> 333.11;
		
		System.out.println(n.getValue());
	
		
		Num n2  = () -> Math.random() * 100;
		System.out.println(n2.getValue());
	
		ValorNumerico isPar = (int i) -> (i % 2 == 0);
		System.out.println(isPar.teste(9));
		
		ValorNumerico2 isDiv = (x, y) -> (x%y)==0;
		System.out.println(isDiv.teste2(8, 9));
	}
}
