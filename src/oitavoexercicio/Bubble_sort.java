package oitavoexercicio;

public class Bubble_sort implements utils.Input {

	private static final int TAMANHO_TOTAL = 5;
	private static int[] elementos = new int[TAMANHO_TOTAL];

	public static void BubbleSort() {

		for (int i = 0; i < elementos.length; i++) {
			System.out.println("Insira um número inteiro:");
			elementos[i] = s.nextInt();
		}

		for (int i = 0; i < elementos.length; i++) {

			for (int j = 0; j < elementos.length-1; j++) {

				if (elementos[j] > elementos[j + 1]) {
					int aux = elementos[j + 1];
					elementos[j + 1] = elementos[j];
					elementos[j] = aux;
				}

			}

		}

		System.out.println("\nElementos digitados ordenados:");

		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i]);
		}

	}

}
