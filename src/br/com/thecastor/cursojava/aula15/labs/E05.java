package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		double n1 = scan.nextDouble();

		System.out.println("Informe a segunda nota");
		double n2 = scan.nextDouble();

		double media = (n1 + n2) / 2;
		
		if (media == 10){
			System.out.println("Aprovado com distinção");
		}else if (media >= 7){
			System.out.println("Aprovado");
		}else if (media < 7){
			System.out.println("Reprovado");
		}
		
	}

}
