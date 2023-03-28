
package Ejercicio06;

import java.util.Scanner;

/**
 Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int varNum1=sc.nextInt();
        int varNum2=sc.nextInt();
        if (varNum1>varNum2) {
            System.out.println("El número mayor es: "+varNum1);
        }else if(varNum1<varNum2){
            System.out.println("El número mayor es: "+varNum2);
        }
    }
    
}
