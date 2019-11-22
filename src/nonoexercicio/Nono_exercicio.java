package nonoexercicio;

public class Nono_exercicio implements utils.Input {
	
	public static void CalcularMedia() {
		
		System.out.println("Digite o total de alunos:");
		int totalAlunos = s.nextInt();
		
		String[] nomes = new String[totalAlunos];
		double[] notas1 = new double[totalAlunos];
		double[] notas2 = new double[totalAlunos];
		double[] medias = new double[totalAlunos];
		
		for (int i=0; i<totalAlunos; i++) {
			
			System.out.println("Digite o nome do Aluno");
			nomes[i] = s.next();
			
			System.out.println("Digite a nota 1 do aluno " + nomes[i]);
			notas1[i] = s.nextDouble();
			
			System.out.println("Digite a nota 2 do aluno " + nomes[i]);
			notas2[i] = s.nextDouble();	
			
		}
		
		for (int i = 0; i < medias.length; i++) {
			
			medias[i] = (notas1[i]+notas2[i])/2;
			
		}
		
		//Bubble sort
		
		double aux = 0;
		String auxNomes = null;
		
		for (int i = 0; i < medias.length; i++) {
			
			for (int j = 0; j < medias.length-1; j++) {
				
				if(medias[j]>medias[j+1]) {
					
					//Ordenando as médias
					aux = medias[j];
					medias[j] = medias[j+1];
					medias[j+1] = aux;
					
					//Ordenando as notas1
					aux = notas1[j];
					notas1[j] = notas1[j+1];
					notas1[j+1] = aux;
					
					//Ordenando as notas2
					
					aux = notas2[j];
					notas2[j] = notas2[j+1];
					notas2[j+1] = aux;
					
					//Ordenando os nomes
					
					auxNomes = nomes[j];
					nomes[j] = nomes[j+1];
					nomes[j+1] = auxNomes;
							
				}
				
			}
			
		}
		
		System.out.println("\nA maior média é: " + medias[totalAlunos-1] + " e ela pertence ao aluno: " + nomes[totalAlunos-1]); //e ela pertence ao aluno X
		System.out.println("A menor média é: " + medias[0] + " e ela pertence ao aluno: " + nomes[0]); //e ela pertence ao aluno Y
					
	}

}
