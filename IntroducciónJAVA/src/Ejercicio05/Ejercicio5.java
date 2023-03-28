
package Ejercicio05;

import java.util.Scanner;

/**
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
public class Ejercicio5 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Integer varNum= sc.nextInt();
        System.out.println("El doble del número ingresado es: "+varNum*2);
        System.out.println("El triple del número ingresado es: "+varNum*3);
        System.out.println("La raíz cuadrada del número ingresado es: "+Math.sqrt(varNum));
        
    }
    
}
