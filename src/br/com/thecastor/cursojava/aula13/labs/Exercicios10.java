package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius:");
		double celsius= scan.nextDouble();

		double farenheit  = (celsius*1.8) + 32;
		
		System.out.println("A temperatura celsius é " + celsius + " equivalente a " + farenheit + " farenheit");
		
	}

}
