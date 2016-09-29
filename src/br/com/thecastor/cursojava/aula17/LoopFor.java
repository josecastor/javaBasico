package br.com.thecastor.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("i tem valor: " + i);			
		}
		
		System.out.println("----------------");
		
		for (int i = 10; i > 0; i--) {
			System.out.println("i tem valor: " + i);			
		}
		
		System.out.println("----------------");
		
		for (int i = 0, j=10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);			
		}

		System.out.println("----------------");
		int count = 0;
		for (; count < 5; ) {
			System.out.println("Valor de count " + count);
			count += 2;
		}

	}

}
