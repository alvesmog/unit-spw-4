import java.util.Scanner;

public class Quarto_exercicio {
	
	public static void testaNumeroValido() {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número ímpar e múltiplo de 3: ");
		
		n = s.nextInt();
		
		if( (n%2!=0) & (n%3==0)) {
			System.out.println("Número válido");
		} else {
			System.out.println("Número inválido");
		}
	
		
	}
		
		
}
