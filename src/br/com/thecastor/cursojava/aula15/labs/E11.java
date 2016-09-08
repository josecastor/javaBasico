package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário");
		double salarioAtual = scan.nextDouble();
		double salarioReajustado = 0;
		int indiceAumento5 = 5;
		int indiceAumento10 = 10;
		int indiceAumento15 = 15;
		int indiceAumento20 = 20;
		
		if (salarioAtual <= 280){
			salarioReajustado = salarioAtual + (salarioAtual*indiceAumento20)/100;
		}else if (salarioAtual > 280 && salarioAtual < 700){
			salarioReajustado = salarioAtual + (salarioAtual*indiceAumento15)/100;
		}else if (salarioAtual >= 700 && salarioAtual < 1500){
			salarioReajustado = salarioAtual + (salarioAtual*indiceAumento10)/100;
		}else if (salarioAtual >= 1500){
			salarioReajustado = salarioAtual + (salarioAtual*indiceAumento5)/100;
		}

		System.out.println("Salário antes do reajuste era: " + salarioAtual);
		System.out.println("Percentual do aumento aplicado foi: " + (((salarioReajustado - salarioAtual)*100)/salarioAtual));
		System.out.println("Valor do aumento é: " + (salarioReajustado - salarioAtual));
		System.out.println("Salário após aumento é: " + salarioReajustado);
		
		

	}

}
