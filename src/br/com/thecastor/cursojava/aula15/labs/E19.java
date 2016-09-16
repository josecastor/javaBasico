package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o segundo número");
		int n2 = scan.nextInt();
		
		System.out.println("Qual operação deseja realizar? 1-Somar | 2-Subtrair | 3-Mutiplicar | 4-Dividir");
		String op = scan.next();
		
		double resultadoOp = 0;
		String parImpar = "";
		boolean valida = true;
		
		if (op.equals("1")){
			resultadoOp = n1 + n2;
		}else if (op.equals("2")){
			resultadoOp = n1 - n2;
		}else if (op.equals("3")){
			resultadoOp = n1 * n2;
		}else if (op.equals("4")){
			resultadoOp = n1 / n2;
		}else{
			System.out.println("Opção de operação inválida");
			valida = false;
		}
		
		if (valida){
			
			if (resultadoOp % 2 == 0){
				parImpar = "Par";
			}else{
				parImpar = "Impar";
			}

			if (resultadoOp > 0){
				System.out.println("Resultado da operação foi " + resultadoOp + " sendo um número " + parImpar + " e esse número é positivo");
			}else{
				System.out.println("Resultado da operação foi " + resultadoOp + " sendo um número " + parImpar + " e esse número é negativo");
			}
			
		}

		
	}

}
