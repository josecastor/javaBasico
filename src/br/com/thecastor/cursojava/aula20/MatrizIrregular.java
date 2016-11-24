package br.com.thecastor.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número de pessoas entrevistadas");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomeFilhos = new String[numEntrevistados][];

		for (int i=0; i<nomeFilhos.length; i++){
			System.out.println("Informe a quantidade de filhos");
			int qtdFilhos = scan.nextInt();
			nomeFilhos[i] = new String[qtdFilhos];
			
			for (int j=0; j<nomeFilhos[i].length; j++){
				System.out.println("Informe o nome do filho " + j );
				nomeFilhos[i][j] = scan.next();
			}			
		}
		
		for (int i=0; i<nomeFilhos.length; i++){
			System.out.println("A pessoa " + i + " tem " + nomeFilhos[i].length);
			for (int j=0; j<nomeFilhos[i].length; j++){
				System.out.println(nomeFilhos[i][j]);
			}
		}
		
	}

}
