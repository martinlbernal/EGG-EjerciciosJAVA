package Ejercicio22;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un numero a buscar en el vector. El programa
 * mostrará donde se encuentra el numero y si se encuentra repetido
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int varTamano = sc.nextInt();
        int[] vector = new int[varTamano];

        llenarVector(vector);
        buscarNumero(vector, sc);

    }

    public static void llenarVector(int[] x) {

        int aleatorio = (int) Math.random();

        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 20) + 1;
            System.out.println(x[i]);
        }
        
    }

    public static void buscarNumero(int[] x, Scanner sc) {
        System.out.println("Ingrese el número que está buscando");
        int numBuscado = sc.nextInt();

        for (int i = 0; i < x.length; i++) {
            if (x[i] == numBuscado) {
                System.out.println("El número " + numBuscado + " se encuentra en el lugar número " + (i+1) + " dentro del vector");

            }

        }

    }

}
