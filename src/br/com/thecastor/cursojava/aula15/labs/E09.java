package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero");
		int p1 = scan.nextInt();

		System.out.println("Informe o segundo n�mero");
		int p2 = scan.nextInt();

		System.out.println("Informe o terceiro n�mero");
		int p3 = scan.nextInt();
		
		if (p1 <= p2 && p1 <= p3 && p2 <= p3){
			System.out.println(p3 + " - " + p2 + " - " + p1);
		}else if (p1 <= p2 && p1 <= p3 && p3 <= p2){
			System.out.println(p2 + " - " + p3 + " - " + p1);
		}else if (p2 <= p1 && p2 <= p3 && p1 <= p3){
			System.out.println(p3 + " - " + p1 + " - " + p2);
		}else if (p2 <= p1 && p2 <= p3 && p3 <= p1){
			System.out.println(p1 + " - " + p3 + " - " + p2);
		}else if (p3 <= p1 && p3 <= p2 && p1 <= p2){
			System.out.println(p2 + " - " + p1 + " - " + p3);
		}else if (p3 <= p1 && p3 <= p2 && p2 <= p1){
			System.out.println(p1 + " - " + p2 + " - " + p3);
		}
		
	}

}
