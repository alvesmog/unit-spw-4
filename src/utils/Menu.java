package utils;
import primeiroexercicio.Primeiro_exercicio;

import quartoexercicio.Quarto_exercicio;
import quintoexercicio.Quinto_exercicio;
import segundoexercicio.Segundo_exercicio;
import setimoexercicio.Setimo_exercicio;
import sextoexercicio.Sexto_exercicio;
import terceiroexercicio.Terceiro_exercicio;
import nonoexercicio.Nono_exercicio;
import oitavoexercicio.Bubble_sort;

public class Menu implements utils.Input {
	
	public static void renderizar() {
		
		System.out.println("\n Escolha o exercício: \n");
		
		System.out.println("1 - Resto divisão inteiros");
		System.out.println("2 - Maior entre dois números");
		System.out.println("3 - Algoritmo de Swap");
		System.out.println("4 - Testar se o número é ímpar e divisível por 3");
		System.out.println("5 - FOR - Todos os números ímpares e divisíveis por 3 até 1*10^6");
		System.out.println("6 - WHILE -Todos os números ímpares e divisíveis por 3 até 1*10^6");
		System.out.println("7 - Sétimo Exercício -> Pilha");
		System.out.println("8 - Oitavo Exercício -> Bubble Sort");
		System.out.println("9 - Nono Exercício -> Bubble Sort de vetores encadeados");
		
		int opcao = s.nextInt();
		
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
				Setimo_exercicio.menuSetimoExercicio();
				break;
			case 8:
				Bubble_sort.BubbleSort();
				break;
			case 9:
				Nono_exercicio.CalcularMedia();
				break;
		}
	
	}
	
}
