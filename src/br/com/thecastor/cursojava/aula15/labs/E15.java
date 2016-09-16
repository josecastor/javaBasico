package br.com.thecastor.cursojava.aula15.labs;

import java.util.Scanner;
// http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
// https://www.youtube.com/watch?v=KJYSXTYgL_o&index=18&list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r -> 1:09:40

public class E15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do primeiro lado do triângulo");
		double l1 = scan.nextDouble();

		System.out.println("Informe o tamanho do segundo lado do triângulo");
		double l2 = scan.nextDouble();

		System.out.println("Informe o tamanho do terceiro lado do triângulo");
		double l3 = scan.nextDouble();
		
		if ((l1 + l2)>l3 || (l1+l3)>l2 || (l2+l3)>l1){
			if (l1 == l2 && l1 == l3){
				System.out.println("Triângulo Equilátero -> os três lados são iguais");
			}else if (l1 == l2 || l1 == l3 || l2 == l3){
				System.out.println("Triângulo Isósceles  -> dois lados são iguais");
			}else{
				System.out.println("Triângulo Escaleno   -> os três lados são diferentes");
			}
		}else{
			System.out.println("Os tamanhos informados não formão nenhum tipo de triângulo");
		}

	}

}
