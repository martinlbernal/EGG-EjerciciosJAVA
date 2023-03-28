// ESTE EJERCICIO ESTA RESUELTO, SIN EMBARGO, NO LOGRO MOSTRAR LA MATRIZ A QUE DEBO MEJORAR LA APLLICACIÓN DE MÉTODOS


package Ejercicio27;

public class Ejercicio27 {
	public static void main(String[] args) {
		//CREAR MATRICES
		int [][] matriz10x10= new int [10][10]; 
		int [][] matriz3x3= new int [3][3];
		
		llenarMatriz10x10(matriz10x10,matriz3x3);
		
		
				
		//BUSCAR LA COINCIDENCIA
		
		
		
	}
	
	public static int llenarMatriz10x10(int [][]matriz10x10, int [][]matriz3x3) {
		//LLENO LA DE 10X10
		for (int i = 0; i < matriz10x10.length; i++) {
			for (int j = 0; j < matriz10x10.length; j++) {
				matriz10x10 [i][j] = 1;
				System.out.print(matriz10x10 [i][j]+ " ");
		
				//LLENO LA DE 3X3
				
				for (int k = 0; k < matriz3x3.length; k++) {
					for (int l = 0; l < matriz3x3.length; l++) {
						matriz3x3 [k][l] = 1;
						System.out.print(matriz3x3 [k][l]+ " ");
						
						
						if	(i==j && k==l) {
							if	(matriz10x10[i][j] == matriz3x3[k][l]) {
								System.out.println("La posición en la matriz de 10 es: "+i+"."+j+" SU VALOR ES: "+matriz10x10 [i][j]);
								System.out.println("La posición en la matriz de 3 es: "+k+"."+l+" SU VALOR ES: "+matriz3x3 [k][l]);
						}
						}
						
					}
					System.out.println("");
			}
			
			
		
		
			
			
			
			
			}
		}
		
		
		return 1;
	} 
	
	

	
}
