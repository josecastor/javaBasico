package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de morangos (kg)");
		double qtdMorango = scan.nextDouble();

		System.out.println("Informe a quantidade de Maçã (kg)");
		double qtdMaca = scan.nextDouble();
		
		double valorAPagar = 0;
		double desconto = 10;
		double valorDesconto = 0;
		
		double vMorangoMenos5kg = 2.5;
		double vMorangoMaior5kg = 2.2;
		double cMorango = 0;
		
		double vMacaMenos5kg = 1.8;
		double vMacaMaior5kg = 1.5;
		double cMaca = 0;

		if (qtdMorango <= 5){
			cMorango = qtdMorango * vMorangoMenos5kg;
		}else{
			cMorango = qtdMorango * vMorangoMaior5kg;
		}
		
		if (qtdMaca <= 5){
			cMaca = qtdMaca * vMacaMenos5kg;
		}else{
			cMaca = qtdMaca * vMacaMaior5kg;
		}
		
		if (((cMorango + cMaca)>25) || ((qtdMorango + qtdMaca)>8)){
			
			valorDesconto = ((cMorango + cMaca) * desconto) / 100;
			valorAPagar = (cMorango + cMaca) - valorDesconto;
			
		}else{
			
			valorAPagar = (cMorango + cMaca);
			
		}
		
		System.out.println("Valor a ser pago: " + valorAPagar);
		
	}

}
