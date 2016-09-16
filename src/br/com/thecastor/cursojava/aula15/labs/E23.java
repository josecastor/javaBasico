package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo de carne F - File Duplo, A - Alcatra e P - Picanha");
		String tipoCarne = scan.next();

		System.out.println("Informe a quantidade de carne (kg)");
		double qtdCarne = scan.nextDouble();
		
		System.out.println("Possui cartão tabajara? S - Sim | N - Não");
		String possuiCartao = scan.next();
		
		double descontoCartao = 0;
		double vDesconto = 0;
		double valorAPagar = 0;
		double precoTotalSemDesconto = 0;
	
		double vFileDuploAte5kg = 4.9;
		double vFileDuploAcima5kg = 5.8;
		
		double vAlcatraAte5kg = 5.9;
		double vAlcatraAcima5kg = 6.8;
		
		double vPicanhaAte5kg = 6.9;
		double vPicanhaAcima5kg = 7.8;
		
		String tipoPagto = "Não";

		if (possuiCartao.equalsIgnoreCase("S")){
			descontoCartao = 5;
			tipoPagto = "Sim";
		}
		
		if (tipoCarne.equalsIgnoreCase("F")){
			
			if (qtdCarne <= 5){				
				vDesconto = ((qtdCarne * vFileDuploAte5kg) * descontoCartao) / 100;
				precoTotalSemDesconto = qtdCarne * vFileDuploAte5kg;
				valorAPagar = (qtdCarne * vFileDuploAte5kg) - vDesconto;				
			}else{				
				vDesconto = ((qtdCarne * vFileDuploAcima5kg) * descontoCartao) / 100;
				precoTotalSemDesconto = qtdCarne * vFileDuploAcima5kg;
				valorAPagar = (qtdCarne * vFileDuploAcima5kg) - vDesconto;					
			}
			
			System.out.println("Tipo da carne escolhida foi File Duplo");
			
		}else if (tipoCarne.equalsIgnoreCase("A")){

			if (qtdCarne <= 5){				
				vDesconto = ((qtdCarne * vAlcatraAte5kg) * descontoCartao) / 100;
				precoTotalSemDesconto = qtdCarne * vAlcatraAte5kg;
				valorAPagar = (qtdCarne * vAlcatraAte5kg) - vDesconto;				
			}else{				
				vDesconto = ((qtdCarne * vAlcatraAcima5kg) * descontoCartao) / 100;
				precoTotalSemDesconto = qtdCarne * vAlcatraAcima5kg;
				valorAPagar = (qtdCarne * vAlcatraAcima5kg) - vDesconto;					
			}
			
			System.out.println("Tipo da carne escolhida foi Alcatra");
			
		}if (tipoCarne.equalsIgnoreCase("P")){

			if (qtdCarne <= 5){				
				vDesconto = ((qtdCarne * vPicanhaAte5kg) * descontoCartao) / 100;
				precoTotalSemDesconto = qtdCarne * vPicanhaAte5kg;
				valorAPagar = (qtdCarne * vPicanhaAte5kg) - vDesconto;				
			}else{				
				vDesconto = ((qtdCarne * vPicanhaAcima5kg) * descontoCartao) / 100;
				precoTotalSemDesconto = qtdCarne * vPicanhaAcima5kg;
				valorAPagar = (qtdCarne * vPicanhaAcima5kg) - vDesconto;					
			}
			
			System.out.println("Tipo da carne escolhida foi Picanha");
			
		}
		
		System.out.println("A quantidade de carne foi: " + qtdCarne);
		System.out.println("Preço total: " + precoTotalSemDesconto);
		System.out.println("Tipo de pagamento com cartão tabajara: " + tipoPagto);
		System.out.println("Valor desconto: " + vDesconto);
		System.out.println("Valor total a pagar: " + valorAPagar);
		
	}

}
