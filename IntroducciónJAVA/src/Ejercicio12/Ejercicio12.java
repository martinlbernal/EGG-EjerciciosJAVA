
package Ejercicio12;

import java.util.Scanner;

/**
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 

 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int varNum;
        
        do {
            System.out.println("Ingrese un numero del 0 al 10");
            varNum=sc.nextInt();
        } while (varNum<0 || varNum>10);
        
        
        
        
        
    }
    
}
