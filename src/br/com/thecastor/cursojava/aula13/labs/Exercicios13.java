package br.com.thecastor.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicios13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor hora ?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mes ?");
		double qtdHora = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHora;
		double inss = (salarioBruto/100)*8;
		double sindicato = (salarioBruto/100)*5;
		double ir = (salarioBruto/100)*11;
		double salarioLiquido = salarioBruto - inss - sindicato - ir;
		double totalDesconto = inss + sindicato + ir;
		
		System.out.println("O salário bruto é de: " + salarioBruto);
		System.out.println("Valor pago de inss: " + inss);
		System.out.println("Valor pago para sindicato: " + sindicato);
		System.out.println("O salário líquido é de: " + salarioLiquido);
		System.out.println("Total descontos: " + totalDesconto);
		
	}

}
