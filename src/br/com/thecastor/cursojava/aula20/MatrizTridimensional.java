package br.com.thecastor.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {

		int[][][] matrizTridimensional = new int[3][3][3];
		
		for (int i=0; i<matrizTridimensional.length; i++){
			for (int j=0; j<matrizTridimensional[i].length; j++){
				for (int y=0; y<matrizTridimensional[i][j].length; y++){
					matrizTridimensional[i][j][y] = i + j + y;
				}
			}
		}

		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i=0; i<matrizTridimensional.length; i++){
			for (int j=0; j<matrizTridimensional[i].length; j++){
				for (int y=0; y<matrizTridimensional[i][j].length; y++){
					soma += matrizTridimensional[i][j][y];
					
					if (matrizTridimensional[i][j][y] % 2 == 0){
						somaPares += matrizTridimensional[i][j][y];
					}else{
						somaImpares += matrizTridimensional[i][j][y];
					}
					
				}
			}
		}
		
		System.out.println("Soma total: " + soma);
		System.out.println("Soma pares: " + somaPares);
		System.out.println("Soma impares: " + somaImpares);
		
	}

}
