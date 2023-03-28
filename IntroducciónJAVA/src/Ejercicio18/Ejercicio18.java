package Ejercicio18;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio18 {
	
	/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*  */
	
	public static void main(String[] args) {
		System.out.println("Ingrese la dimensión de su cuadrado");
		Scanner sc = new Scanner(System.in);
		int varDimension= sc.nextInt();
	
		functionDibujarAltura(varDimension);
		
		
		
		
	
				
	}
	public static void functionDibujarAltura(int varDimension) {
		
		//Dibujo línea superior 
		for (int i = 0; i < varDimension; i++) {
			System.out.print("*");
		}
		System.out.println();
		

		//dibujo el medio
				
				for (int i = 0; i < varDimension-2; i++) {
					System.out.print("*");
					for (int j = 0; j < varDimension-2; j++) {
						System.out.print(" ");
				}
					System.out.println("*");
				}
		
		//Dibujo línea inferior
				for (int i = 0; i < varDimension; i++) {
					System.out.print("*");
				}

		

			
		}
		
		
		
		
		
		
	}


	

	
	 


