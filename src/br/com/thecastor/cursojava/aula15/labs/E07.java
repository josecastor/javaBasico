package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero");
		int p1 = scan.nextInt();

		System.out.println("Informe o segundo n�mero");
		int p2 = scan.nextInt();

		System.out.println("Informe o terceiro n�mero");
		int p3 = scan.nextInt();
		
		if (p1 > p2 && p1 > p3){
			System.out.println("O maior n�mero �: " + p1);
		}else if (p2 > p1 && p2 > p3){
			System.out.println("O maior n�mero �: " + p2);
		}else if (p3 > p1 && p3 > p2){
			System.out.println("O maior n�mero �: " + p3);
		}
		
		if (p1 < p2 && p1 < p3){
			System.out.println("O menor n�mero �: " + p1);
		}else if (p2 < p1 && p2 < p3){
			System.out.println("O menor n�mero �: " + p2);
		}else if (p3 < p1 && p3 < p2){
			System.out.println("O menor n�mero �: " + p3);
		}		

	}

}
