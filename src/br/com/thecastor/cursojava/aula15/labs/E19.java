package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero");
		int n2 = scan.nextInt();
		
		System.out.println("Qual opera��o deseja realizar? 1-Somar | 2-Subtrair | 3-Mutiplicar | 4-Dividir");
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
			System.out.println("Op��o de opera��o inv�lida");
			valida = false;
		}
		
		if (valida){
			
			if (resultadoOp % 2 == 0){
				parImpar = "Par";
			}else{
				parImpar = "Impar";
			}

			if (resultadoOp > 0){
				System.out.println("Resultado da opera��o foi " + resultadoOp + " sendo um n�mero " + parImpar + " e esse n�mero � positivo");
			}else{
				System.out.println("Resultado da opera��o foi " + resultadoOp + " sendo um n�mero " + parImpar + " e esse n�mero � negativo");
			}
			
		}

		
	}

}
