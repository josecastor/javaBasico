package br.com.thecastor.cursojava.aula17.labs;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean condicao = false;
		
		for (; condicao == false; ) {
			
			System.out.println("Informe o nome de usuário");
			String nameUser = scan.nextLine();

			System.out.println("Informe a senha");
			String passUser = scan.nextLine();
			
			if (!nameUser.contentEquals(passUser)) {
				condicao = true;
			}
			
		}

	}

}
