import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite um numero inteiro");
		
		n1 = s.nextInt();
		
		System.out.println("Digite outro numero inteiro");
		
		n2 = s.nextInt();
		
		n3 = n1%n2;
		
		System.out.println("O resto da divisão de " + n1 + " por " + n2 + " é... " + n3);
		

	}

}
