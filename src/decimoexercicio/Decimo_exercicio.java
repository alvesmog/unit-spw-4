package decimoexercicio;

public class Decimo_exercicio implements utils.Input {

	public static void ordenarAleatorios() {

		System.out.println("Quantos números aleatórios você quer?");

		int[] arr = new int[s.nextInt()];

		// Gerar números inteiros aleatórios e popular o vetor
		for (int i = 0; i < arr.length; i++) {

			int numeroInteiroAleatorio = (int) (Math.random() * 100);

			arr[i] = numeroInteiroAleatorio;

		}

		// Imprimir vetor na ordem gerada

		System.out.print("\nVetor gerado: [");

		StringBuffer vetorGerado = new StringBuffer();

		for (int i : arr) {
			vetorGerado.append(i + ", ");
		}

		vetorGerado.delete(vetorGerado.length() - 2, vetorGerado.length());
		vetorGerado.append("]");
		System.out.print(vetorGerado);

		// Ordenar o vetor

		System.out.print("\nVetor ordenado: [");
		
		StringBuffer vetorOrdenado = new StringBuffer();

		int n = arr.length;
		for (int j = 1; j < n; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		
		for (int i : arr) {
			vetorOrdenado.append(i + ", ");
		}
		
		vetorOrdenado.delete(vetorOrdenado.length() - 2, vetorOrdenado.length());
		vetorOrdenado.append("]");
		System.out.print(vetorOrdenado);

	}

}
