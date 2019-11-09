import java.util.Scanner;

public class Menu {
	
	public static void renderizar() {
		
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("\n Escolha o exercício: \n");
		
		System.out.println("1 - Resto divisão inteiros");
		System.out.println("2 - Maior entre dois números");
		System.out.println("3 - Algoritmo de Swap");
		System.out.println("4 - Testar se o número é ímpar e divisível por 3");
		System.out.println("5 - FOR - Todos os números ímpares e divisíveis por 3 até 1*10^6");
		System.out.println("6 - WHILE -Todos os números ímpares e divisíveis por 3 até 1*10^6");
		System.out.println("7 - Pilha -> Método PUSH");
		System.out.println("8 - Pilha -> Método POP");
		System.out.println("9 - Pilha -> Exibir elemento no topo da pilha");
		
		int opcao = s2.nextInt();
		
		s2.close();
		
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
				break;
			case 5:
				Quinto_exercicio.todosOsNumeros();
				break;
			case 6:
				Sexto_exercicio.todosOsNumeros();
				break;
			case 7:
				Setimo_exercicio.push();
				break;
			case 8:
				Setimo_exercicio.pop();
				break;
			case 9:
				Setimo_exercicio.top();
				break;
				
		}
	
	}
	


}
