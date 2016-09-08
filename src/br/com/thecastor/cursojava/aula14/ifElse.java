package br.com.thecastor.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe idade");
		int idade = scan.nextInt();
		
		if (idade >= 18){
			System.out.println("É maior de 18 anos");
		}else{
			System.out.println("É menor de 18 anos");
		}

		System.out.println("Informe o valor do produto");
		double valorProduto = scan.nextDouble();
		
		if (valorProduto <= 10){
			System.out.println("Está barato");
		}else if (valorProduto > 10 && valorProduto <= 15){
			System.out.println("Pedir desconto");
		}else if (valorProduto > 15 && valorProduto <= 17){
			System.out.println("Pesquise mais");
		}else{
			System.out.println("Muito caro");
		}
	}

}
