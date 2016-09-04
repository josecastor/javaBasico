package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit:");
		double farenheit = scan.nextDouble();
		
		double celsius = (5 * (farenheit-32) / 9);
		
		System.out.println("A temperatura farenheit é " + farenheit + " equivalente a " + celsius + " celcius");
		
	}

}
