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

			if (i >= elementos.length) {
				System.out.println("ok");
			} else {
				if (elementos[i] > elementos[i + 1]) {
					int aux = elementos[i + 1];
					elementos[i + 1] = elementos[i];
					elementos[i] = aux;
				}

			}

		}

		System.out.println("\nElementos digitados ordenados:");

		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i]);
		}

	}

}
