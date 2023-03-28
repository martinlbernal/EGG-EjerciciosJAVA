
package Ejercicio03;

import java.util.Scanner;

/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String varFrase= sc.nextLine();
        System.out.println("Su frase tipeada " +varFrase);
        System.out.println("Su frase en mayúsculas " +varFrase.toUpperCase());
        System.out.println("Su frase en minúsculas " +varFrase.toLowerCase());
        
        
        
    }
    
}
