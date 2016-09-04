package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		double n1 = scan.nextDouble();

		System.out.println("Informe a segunda nota");
		double n2 = scan.nextDouble();
		
		System.out.println("Informe a terceira nota");
		double n3 = scan.nextDouble();
		
		System.out.println("Informe a quarta nota");
		double n4 = scan.nextDouble();
		
		System.out.println("A média2 é: " + (n1 + n2 + n3 + n4)/4);
	}

}
