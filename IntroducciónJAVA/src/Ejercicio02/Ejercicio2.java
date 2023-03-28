
package Ejercicio02;

import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
*/

public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        String varNombre= sc.next();
        System.out.println("El nombre es: "+varNombre);
    }
    
}
