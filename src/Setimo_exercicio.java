import java.util.Scanner;

public class Setimo_exercicio {
	
	private static final int TAMANHO_PILHA = 5;
	private static int topo = -1;
	private static int[] elementos = new int[TAMANHO_PILHA];
	
	public static void push() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para ser adicionado ao topo da pilha: ");
		
		int elemento = s.nextInt();
		
		topo++;
		elementos[topo] = elemento;
		
		for(int i=0; i<elementos.length;i++) {
			System.out.print(elementos[i]+", ");
		}
		
		s.close();
		
		
	}
	
	public static void pop() {
		
		int eliminado = elementos[elementos.length-1];
		
		System.out.println("Eliminando o elemento "+eliminado+" do topo da pilha...");
		
		System.out.println("Nova pilha: ");
		
		for(int i=0; i<elementos.length;i++) {
			System.out.print(elementos[i]+", ");
		}
		
	}
	
	public static void top() {
		
		int elementoNoTopo = elementos[elementos.length-1];
		
		System.out.println(elementoNoTopo + " é o elemento no topo da pilha.");
		
	}

}
