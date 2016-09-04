package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor hora ?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mes ?");
		double qtdHora = scan.nextDouble();
		
		double salario = valorHora * qtdHora;
		
		System.out.println("O salário é de: " + salario);
		
		
	}

}
