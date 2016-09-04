package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamaho do arquivo");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da internet");
		double velocidadeInternet = scan.nextDouble();
		
		double tempoDownload = tamanhoArquivo/velocidadeInternet;
		System.out.println("Tempo de download é de: " + tempoDownload);
		
	}

}
