package Ejercicio26;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ejercicio26 {

	/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.*/
	
	public static void main(String[] args) {
		//Crear una matriz de 3*3
		//Determinar si es màgico o no: comprobar que están entre el 1 y el 9
		
		
		Scanner sc = new Scanner(System.in);
		int [][] matriz = new int [3][3];
		// PRUEBA MANUAL{{3,3,3} ,{3,3,3}, {3,3,3}};
		
		int sumaFila=0;
		int sumaColum=0;
		int sumaDiagPri=0;
		int sumaDiagSec=0;
		
		
			 for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	            	 matriz[i][j] = (int) (Math.random() * 9) ;
	            	 System.out.print(matriz[i][j] + " ");
	            	 System.out.println("Posicion"+i+"."+j);
	            	 
	            	 
	            	 if(matriz[i][j]<1||matriz[i][j]>9) {
	            	System.out.print("Ingrese un nuevo numero");
	            	matriz[i][j]= sc.nextInt();
	            	 }
	             	            	
	            	 sumaFila += matriz[i][j];
	            	 System.out.print("ESTO SUMA LA FILA "+i+"."+j+": "+sumaFila);
	            	 System.out.println("");
	            	 System.out.print("el numero ingresado es: "+matriz[i][j] + " ");
	            	 System.out.println("");
	            	 
	            	 sumaColum += matriz[j][i];
	            	 System.out.print("ESTO SUMA LA COLUMNA "+i+"."+j+"; "+sumaColum);
	            	 System.out.println("");
	            	 System.out.print("el numero ingresado es: "+matriz[i][j] + " ");
	            	 System.out.println("");
	            	 System.out.println("");
	            	
	            	 
	            	 if(i==j) {
	 					sumaDiagPri+= matriz[i][j];
	 				}	
	            	 if((matriz.length-1)==j) {
	            		 sumaDiagSec+= matriz[i][j];
	            	 }
	 		
	            }
	            
	            //esto es un espacio
	            System.out.println("");
	            
	            
	         
	        }
			 
			if(sumaFila==sumaColum && sumaDiagPri==sumaDiagSec ) {
        		 System.out.println("Es magico");
        			 
        		 }else {
        			 System.out.println("No es magico");
        		 }
			
        	 }
			
			
			 
			

	
	
	
}
