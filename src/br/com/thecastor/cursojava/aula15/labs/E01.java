package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero");
		int p1 = scan.nextInt();

		System.out.println("Informe o segundo n�mero");
		int p2 = scan.nextInt();
		
		if (p1 > p2){
			System.out.println(p1 + " � maior que " + p2);
		}else{
			System.out.println(p2 + " � maior que " + p1);
		}

	}

}
