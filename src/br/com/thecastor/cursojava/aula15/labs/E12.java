package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora de trabalho");
		double valorHora = scan.nextDouble();

		System.out.println("Informe a quantidade de horas trabalhadas");
		double qtdHoraTrabalhada = scan.nextDouble();
		
		// -> desconto imposto de renda
		// -> desconto sindicato
		// -> desconto FGTS
		
		double salarioBruto = 0;
		double descontoIR = 0;
		double descontoSindicato = 0;
		double valorFgts = 0;
		double salarioLiquido = 0;
		double valorInss = 0;
		
		int indiceDescontoIr0 = 0;
		int indiceDescontoIr5 = 5;
		int indiceDescontoIr10 = 10;
		int indiceDescontoIr20 = 20;
		int indiceDescontoIrAplicado = 0;
		
		int indiceDescontoSindicato = 3;
		
		int indiceFgts = 11;
		
		int indiceDescontoInss = 10;
		
		// Salario Bruto
		salarioBruto = qtdHoraTrabalhada * valorHora;		
		
		// Desconto IR
		if (salarioBruto <= 900){
			descontoIR = (salarioBruto*indiceDescontoIr0)/100;
			indiceDescontoIrAplicado = indiceDescontoIr0;
		}else if (salarioBruto > 900 && salarioBruto < 1500){
			descontoIR = (salarioBruto*indiceDescontoIr5)/100;
			indiceDescontoIrAplicado = indiceDescontoIr5;
		}else if (salarioBruto >= 1500 && salarioBruto < 2500){			
			descontoIR = (salarioBruto*indiceDescontoIr10)/100;
			indiceDescontoIrAplicado = indiceDescontoIr10;
		}else if (salarioBruto >= 2500){
			descontoIR = (salarioBruto*indiceDescontoIr20)/100;
			indiceDescontoIrAplicado = indiceDescontoIr20;
		}

		// Desconto Sindicato
		descontoSindicato = (salarioBruto*indiceDescontoSindicato)/100;
		
		// Desconto FGTS
		valorFgts = (salarioBruto*indiceFgts)/100;
		
		valorInss = (salarioBruto * indiceDescontoInss)/100;
		
		salarioLiquido = salarioBruto - descontoIR - valorInss;
				
		System.out.println("Salário Bruto (" + valorHora + " * " + qtdHoraTrabalhada + ")	: R$ " + salarioBruto);
		System.out.println("(-) IR (" + indiceDescontoIrAplicado + "%)	: R$ " + descontoIR);
		System.out.println("(-) INSS (" + indiceDescontoInss + "%)	: R$ " + valorInss);
		System.out.println("FGTS (" + indiceFgts + "%) : R$ " + valorFgts);
		System.out.println("Total de descontos	: R$ " + (descontoIR + valorInss));
		System.out.println("Salário líquido	: R$ " + salarioLiquido);
		
	}

}
