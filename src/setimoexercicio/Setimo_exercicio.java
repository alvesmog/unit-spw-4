package setimoexercicio;

public class Setimo_exercicio implements utils.Input {

	public static void menuSetimoExercicio() {

		System.out.println("\nSétimo Exercício (Pilha)");
		System.out.println("1 - Criar pilha");
		System.out.println("2 - Exibir pilha");
		System.out.println("3 - Push");
		System.out.println("4 - Pop");
		System.out.println("5 - Top");
		System.out.println("6 - Is Full?");
		System.out.println("7 - Is Empty?");

		int opcao = s.nextInt();

		switch (opcao) {

		case 1:{ //Criar
			Pilha p = new Pilha();
			System.out.println("Pilha criada!");
			
		}

		case 2:{//Exibir
			Pilha.exibir();
		}

		case 3: { // Push
			System.out.println("Digite um número inteiro para ser adicionado ao topo da pilha: ");
			int elemento = s.nextInt();
			Pilha.push(elemento);
			break;
		}

		case 4: { // Pop
			Pilha.pop();

		}
		
		case 5:{ // Top
			Pilha.top();
		}
		
		case 6:{ //Is Full?
			Pilha.isFull();
		}
		
		case 7:{ //Is empty?
			Pilha.isEmpty();
		}
		
		}

	}

}
