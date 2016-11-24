package br.com.thecastor.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] arrayTempDia = new double[365];
		
		arrayTempDia[0] = 31.3;
		arrayTempDia[1] = 31;
		arrayTempDia[2] = 26;
		arrayTempDia[3] = 30;
		arrayTempDia[4] = 27;
		
		System.out.println("Tamanho do array é: " + arrayTempDia.length);
		
		for (int i=0; i<arrayTempDia.length; i++){
			System.out.println("Temp do dia " + (i+1) + " é: " + arrayTempDia[i]);
		}
			
		for (double temp : arrayTempDia){
			System.out.println("Temp do dia é: " + temp);
		}
		
	}

}
