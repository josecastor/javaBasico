package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe primeiro número inteiro:");
		int n1 = scan.nextInt();

		System.out.println("Informe segundo número inteiro:");
		int n2 = scan.nextInt();
		
		System.out.println("Informe terceiro número double:");
		double n3 = scan.nextDouble();
		
		int r1 = (n1 * 2) + (n2/2);
		
		double r2 = (n1*3) + n3;
		
		double r3 = Math.pow(n3, 3);
		
		System.out.println("Resultado 1 " + r1);
		System.out.println("Resultado 2 " + r2);
		System.out.println("Resultado 3 " + r3);
		
	}

}
