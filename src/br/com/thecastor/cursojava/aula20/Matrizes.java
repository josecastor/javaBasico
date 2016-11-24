package br.com.thecastor.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		for (int i=0; i < notasAlunos.length; i++){
			for (int j=0; j<4; j++){
				notasAlunos[i][j] = i+j;
				System.out.println("Notas do aluno " + i + " nota " + j + " é: " + notasAlunos[i][j]);
			}
		
		}

	}

}
