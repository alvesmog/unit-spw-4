import java.util.Scanner;

public class Quinto_exercicio {

	public static void todosOsNumeros() {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número inteiro qualquer: ");
		
		n = s.nextInt();
		
		System.out.println("Todos os números ímpares e múltiplos de 3 a partir de "+n+":");
		
		for(int i=n; i<=1000000; i++) {
			
			if( (i%2!=0) & (i%3==0)) {
				System.out.println(i);
			} 
		}
				
		s.close();
		
	}

}
