package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe altura:");
		double altura = scan.nextDouble();

		double pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("O peso ideal é: " + pesoIdeal);
		
	}

}
