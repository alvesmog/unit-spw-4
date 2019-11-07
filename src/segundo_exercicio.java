import java.util.Scanner;

public class segundo_exercicio {
	
	public static void maiorEntreDoisNumeros() {
		
		Scanner s = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite o primeiro número inteiro:");
		
		n1 = s.nextInt();
		
		System.out.println("Digite o segundo número inteiro:");
		
		n2 = s.nextInt();
		
		if(n1>n2) {
			System.out.println("O maior entre os dois é: " + n1);			
		} else if (n2>n1) {
			System.out.println("O maior entre os dois é: " + n2);
		} else if (n2==n1) {
			System.out.println("Os números são iguais!");
		}
		
		s.close();
		
	}

}
