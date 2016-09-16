package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de a");
		int a = scan.nextInt();

		if (a == 0){
			System.out.println("A equação não é de segundo grau");
		}else{

			System.out.println("Informe o valor de v");
			int b = scan.nextInt();

			System.out.println("Informe o valor de c");
			int c = scan.nextInt();
			
			double delta = (b*b) - (4 * a * c);
			
			if (delta < 0){
				System.out.println("Delta negatico");
			}else{
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				System.out.println("Delta -> " + delta);
				System.out.println("X1 -> " + x1);
				System.out.println("X2 -> " + x2);
			}

		}
		
		

		
	}

}
