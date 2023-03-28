
package Ejercicio07;

import java.util.Scanner;

/**
Crear un programa que dado un numero determine si es par o impar
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int varNum1=sc.nextInt();
        if ((varNum1%2)==0) {
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
    
}
