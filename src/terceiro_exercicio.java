import java.util.Scanner;

public class Terceiro_exercicio {
	
	public static void algoritmoDeSwap() {
		
		Scanner s = new Scanner(System.in);
		
		int n1,n2,aux;
		
		System.out.println("Digite o primeiro número inteiro: ");
		
		n1 = s.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		
		n2 = s.nextInt();
		
		System.out.println("Valores digitados: " + n1 + ", " + n2);
		
		//Onde a mágica acontece:
		
		aux = n1;
		
		n1 = n2;
		
		n2 = aux;
		
		System.out.println("Valores invertidos: " + n1 + ", " + n2);
		
		s.close();
		
	}

}
