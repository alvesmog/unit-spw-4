import java.util.Scanner;

public class Quinto_exercicio {

	public static void todosOsNumeros() {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		final int LIMITE = 1000000;
		
		System.out.println("Digite um número inteiro qualquer: ");
		
		n = s.nextInt();
		
		System.out.println("Todos os números ímpares e múltiplos de 3 a partir de "+n+":");
		
		for(; n<=LIMITE; n++) {
			
			if( (n%2!=0) & (n%3==0)) {
				System.out.println(n);
			} 
		}
				
		s.close();
		
	}

}
