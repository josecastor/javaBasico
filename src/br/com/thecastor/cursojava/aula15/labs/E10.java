package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma letra seguinto as opções M-matutino V-vespertino ou N-noturno");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("m")){
			System.out.println("Bom dia !");
		}else if (letra.equalsIgnoreCase("v")){
			System.out.println("Boa tarde !");
		}else if (letra.equalsIgnoreCase("n")){
			System.out.println("Boa noite !");
		}else{
			System.out.println("Opção inválida !");
		}

	}

}
