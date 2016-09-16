package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para vítima?");
		String p1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String p2 = scan.next();
		
		System.out.println("Mora perto da vítima?");
		String p3 = scan.next();
		
		System.out.println("Devia para vítima");
		String p4 = scan.next();
		
		System.out.println("Já trabalhou com a vítima");
		String p5 = scan.next();
		
		int cont = 0;
		
		if (p1.equalsIgnoreCase("S")){
			cont++;
		}else if (p2.equalsIgnoreCase("S")){
			cont++;
		}else if (p3.equalsIgnoreCase("S")){
			cont++;
		}else if (p4.equalsIgnoreCase("S")){
			cont++;
		}else if (p5.equalsIgnoreCase("S")){
			cont++;
		}
		
		if (cont == 2){
			System.out.println("Suspeita");
		}else if (cont == 3 || cont == 4){
			System.out.println("Cúmplice");
		}else if (cont == 5){
			System.out.println("Assassino");
		}else if (cont == 0){
			System.out.println("Inocente");
		}
		
	}

}
