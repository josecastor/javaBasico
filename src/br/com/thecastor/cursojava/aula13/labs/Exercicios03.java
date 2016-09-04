package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro número");
		int valor1 = scan.nextInt();

		System.out.println("Informe segundo número");
		int valor2 = scan.nextInt();
		
		System.out.println("Soma dos números é: " + (valor1 + valor2));
		
	}

}
