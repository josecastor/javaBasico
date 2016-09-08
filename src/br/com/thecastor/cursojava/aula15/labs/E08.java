package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro preço");
		double p1 = scan.nextDouble();

		System.out.println("Informe o segundo preço");
		double p2 = scan.nextDouble();

		System.out.println("Informe o terceiro preço");
		double p3 = scan.nextDouble();

		if (p1 < p2 && p1 < p3){
			System.out.println("O menor preço é: " + p1);
		}else if (p2 < p1 && p2 < p3){
			System.out.println("O menor preço é: " + p2);
		}else if (p3 < p1 && p3 < p2){
			System.out.println("O menor preço é: " + p3);
		}		

	}

}
