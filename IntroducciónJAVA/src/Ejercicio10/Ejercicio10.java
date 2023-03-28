
package Ejercicio10;

import java.util.Scanner;

/**
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class Ejercicio10 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String varFrase= sc.nextLine().toUpperCase();
        String varDiv=varFrase.substring(0,1);
        if (varDiv.equals("A")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        
    }
    
}
