package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		double n1 = scan.nextDouble();

		System.out.println("Informe a segunda nota");
		double n2 = scan.nextDouble();
		
		double media = (n1+n2)/2;
		
		if (media >= 0 && media < 4){
			System.out.println("Suas notas foi " + n1 + " e " + n2 + " com media " + media + " tendo conceito E e você foi REPROVADO");
		}else if (media >= 4 && media < 6){
			System.out.println("Suas notas foi " + n1 + " e "  + n2 + " com media " + media + " tendo conceito D e você foi REPROVADO");
		}else if (media >= 6 && media < 7.5){
			System.out.println("Suas notas foi " + n1 + " e " + n2 + " com media " + media + " tendo conceito C e você foi APROVADO");
		}else if (media >= 7.5 && media < 9){
			System.out.println("Suas notas foi " + n1 + " e " + n2 + " com media " + media + " tendo conceito B e você foi APROVADO");
		}else if (media >= 9 && media < 10){
			System.out.println("Suas notas foi " + n1 + " e " + n2 + " com media " + media + " tendo conceito A e você foi APROVADO");
		}
		
	}

}
