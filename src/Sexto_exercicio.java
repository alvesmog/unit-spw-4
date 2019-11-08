import java.util.Scanner;

public class Sexto_exercicio {

	public static void todosOsNumeros() {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		final int LIMITE = 1000000;
		
		System.out.println("Digite um número inteiro qualquer: ");
		
		n = s.nextInt();
		
		System.out.println("Todos os números ímpares e múltiplos de 3 a partir de "+n+":");
	
		
		while(n<=LIMITE) {
			if( (n%2!=0) & (n%3==0)) {
				System.out.println(n);
			} 
			n++;
		}
				
		s.close();
		
	}
	
}
