package br.com.thecastor.cursojava.aula17.labs;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean nota = false;
		
		for (; nota == false; ) {
			
			System.out.println("Informe uma nota");
			double n1 = scan.nextDouble();
			
			if (n1 >= 0 && n1 <= 10) {
				nota = true;
			}
			
		}

	}

}
