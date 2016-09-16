package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int n1 = scan.nextInt();

		if (n1 % 2 == 0){
			System.out.println("Par");
		}else{
			System.out.println("Ímpar");
		}
		
	}

}
