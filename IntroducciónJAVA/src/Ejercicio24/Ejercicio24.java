/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la 
muestre ordenada por sus columnas.
 */
package Ejercicio24;

import java.util.Arrays;

public class Ejercicio24 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int col1 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;

            }
            System.out.println(Arrays.toString(matriz[i]));
        }

    }

}
