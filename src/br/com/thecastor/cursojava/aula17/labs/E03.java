package br.com.thecastor.cursojava.aula17.labs;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean condicao = false;

		System.out.println("Informe o nome de usu�rio");
		String nameUser = scan.nextLine();
		
		if (nameUser.length()<=3){
			System.out.println("Nome inv�lido");
		}
		
		System.out.println("Informe a idade");
		int ageUser = scan.nextInt();
		
		if (ageUser > 150) {
			System.out.println("idade inv�lido");
		}

		System.out.println("Informe o sal�rio");
		double salaryUser = scan.nextDouble();
		
		if (salaryUser <= 0) {
			System.out.println("Sal�rio inv�lido");
		}
		
		System.out.println("Informe o sexo (i) ou (m)");
		String sexUser = scan.next();
		
		if (!sexUser.contentEquals("i") && !sexUser.contentEquals("m")) {
			System.out.println("Op��o de sexo inv�lida");
		}
		
		System.out.println("Informe o estado c�vil (s), (c), (v), (d)");
		String maritalStateUser = scan.next();
		
		if (!maritalStateUser.equalsIgnoreCase("s") && !maritalStateUser.equalsIgnoreCase("c") && !maritalStateUser.equalsIgnoreCase("v") && !maritalStateUser.equalsIgnoreCase("d")) {
			System.out.println("Estado c�vil inv�lido");
		}
			
		

	}

}
