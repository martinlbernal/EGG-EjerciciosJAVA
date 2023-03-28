
package Ejercicio08;

import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String varFrase= sc.nextLine().toUpperCase();
        if (varFrase.equals("EUREKA")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
