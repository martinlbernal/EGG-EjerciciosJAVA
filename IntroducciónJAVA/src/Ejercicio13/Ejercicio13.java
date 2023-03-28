
package Ejercicio13;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 

 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor a 0");
        int varNum = sc.nextInt();
        int varResultado = 0;
        do {
           
            System.out.println("Ingrese un numero");
            int varSuma=sc.nextInt();
            
            varResultado = varResultado+varSuma;
        } while (!(varNum<varResultado));
        
        
        
        
    }
    
}
