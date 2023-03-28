package Ejercicio17;

import java.util.Scanner;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E 0-0-4 . . 0-1-2
 * 0-1-E Nota: investigar función equals() y como convertir números a String.
 */
public class Ejercicio17 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador=funcionContadores();
        
	}

    

    public static int funcionContadores() {
int contador = 0;


for (int h = 0; h <= 9; h++) {
        for (int i = 0; i < 9; i++) {
        	for (int j = h; i < 9; i++) {
        		for (int k = h; i < 10; i++) {
        			String numValue=String.valueOf(i);
        			
        			if(numValue.equals("3")) {
        				System.out.print(k+"-");
            			System.out.print(j+"-");
        				System.out.println("E");
        				break;
        			}
            		System.out.print(k+"-");
        			System.out.print(j+"-");
            		System.out.print(i+"");
            		System.out.println("");
           
        		}
                }
     
    }
              
}
return 1;
}
}



