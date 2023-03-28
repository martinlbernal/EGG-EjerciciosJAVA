
package Ejercicio09;

import java.util.Scanner;

/**
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class Ejercicio9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String varFrase=sc.nextLine();
        if (varFrase.length()==8) {
            System.out.println("CORRECTO");
            }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
