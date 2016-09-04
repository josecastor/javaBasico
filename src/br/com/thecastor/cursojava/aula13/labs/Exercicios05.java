package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a qtd de metros");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + " metros é igual a " + cm + " centrimetros");
		
	}

}
