/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de 
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa).
 */
package Ejercicio25;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];

        //llena la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
                //imprimo la matriz
                System.out.print(matriz[i][j] + " ");
            }
            //esto es un espacio
            System.out.println("");
        }
        
        //llena la transpuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
            
           }
        //imprime la transpuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");

            }
            //esto es un espacio
System.out.println("");
        }
    }
}
