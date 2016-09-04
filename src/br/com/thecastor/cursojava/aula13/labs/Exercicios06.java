package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area);
		
	}

}
