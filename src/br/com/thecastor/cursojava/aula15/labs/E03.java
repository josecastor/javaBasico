package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma letra");
		String letra = scan.nextLine().toUpperCase();
		
		if (letra.equals("M")){
			System.out.println(letra + " - Masculino"); 
		}else if (letra.equals("F")){
			System.out.println(letra + " - Feminino");
		}else{
			System.out.println(letra + " Sexo Inválido");
		}

	}

}
