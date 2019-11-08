import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("Escolha o exercício: \n");
		
		System.out.println("1 - Resto divisão inteiros");
		System.out.println("2 - Maior entre dois números");
		System.out.println("3 - Algoritmo de Swap");
		System.out.println("4 - Testar se o número é ímpar e divisível por 3");
		
		int opcao = s2.nextInt();
		
		switch (opcao) {
		
			case 1:
				Primeiro_exercicio.restoDivisaoInteiros();
				break;
			case 2:
				Segundo_exercicio.maiorEntreDoisNumeros();
				break;
			case 3:
				Terceiro_exercicio.algoritmoDeSwap();
				break;
			case 4:
				Quarto_exercicio.testaNumeroValido();
				
		}
		
	}

}
