package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana de 1 a 7");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana){
		case 1: System.out.println(diaSemana + " - Domingo"); break;
		case 2: System.out.println(diaSemana + " - Segunda"); break;
		case 3: System.out.println(diaSemana + " - Ter�a"); break;
		case 4: System.out.println(diaSemana + " - Quarta"); break;
		case 5: System.out.println(diaSemana + " - Quinta"); break;
		case 6: System.out.println(diaSemana + " - Sexta"); break;
		case 7: System.out.println(diaSemana + " - S�bado"); break;
		default: System.out.println("N�o � um dia da semana v�lido"); break;
		}

	}

}
