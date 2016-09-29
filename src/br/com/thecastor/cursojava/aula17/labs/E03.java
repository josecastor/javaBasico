package br.com.thecastor.cursojava.aula17.labs;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean condicao = false;

		System.out.println("Informe o nome de usuário");
		String nameUser = scan.nextLine();
		
		if (nameUser.length()<=3){
			System.out.println("Nome inválido");
		}
		
		System.out.println("Informe a idade");
		int ageUser = scan.nextInt();
		
		if (ageUser > 150) {
			System.out.println("idade inválido");
		}

		System.out.println("Informe o salário");
		double salaryUser = scan.nextDouble();
		
		if (salaryUser <= 0) {
			System.out.println("Salário inválido");
		}
		
		System.out.println("Informe o sexo (i) ou (m)");
		String sexUser = scan.next();
		
		if (!sexUser.contentEquals("i") && !sexUser.contentEquals("m")) {
			System.out.println("Opção de sexo inválida");
		}
		
		System.out.println("Informe o estado cívil (s), (c), (v), (d)");
		String maritalStateUser = scan.next();
		
		if (!maritalStateUser.equalsIgnoreCase("s") && !maritalStateUser.equalsIgnoreCase("c") && !maritalStateUser.equalsIgnoreCase("v") && !maritalStateUser.equalsIgnoreCase("d")) {
			System.out.println("Estado cívil inválido");
		}
			
		

	}

}
