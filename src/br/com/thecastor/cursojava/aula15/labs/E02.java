package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		int n1 = scan.nextInt();

		if (n1 >= 0){
			System.out.println(n1 + " � positivo");
		}else{
			System.out.println(n1 + " � negativo");
		}
	}

}
