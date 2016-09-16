package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de litros vendida");
		double litros = scan.nextDouble();
		
		System.out.println("Informe o tipo de combustível");
		String tipo = scan.next();
		
		double precoGasolinaLitro = 2.5;
		double precoAlcoolLitro = 1.9;
		int porcentagemDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		
		if (tipo.equalsIgnoreCase("a")){
			if (litros <= 20){
				porcentagemDesconto = 3;
			}else{
				porcentagemDesconto = 5;
			}
			
			total = litros * precoAlcoolLitro;
			
		}else if (tipo.equalsIgnoreCase("g")){
			if (litros <= 20){
				porcentagemDesconto = 4;
			}else{
				porcentagemDesconto = 6;
			}
			
			total = litros * precoGasolinaLitro;
			
		}else{
			System.out.println("tipo de combustível informado errado");
		}
		
		totalDesconto = (total / 100) * porcentagemDesconto;
		
		double precoAPagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago : " + precoAPagar);
		
	}

}
