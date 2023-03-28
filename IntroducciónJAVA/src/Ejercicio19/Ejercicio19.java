
package Ejercicio19;

import java.util.Scanner;

/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 *********** 
2 **
 */
public class Ejercicio19 {

  
    public static void main(String[] args) {
        int varNum1=funcionVerificar();
        funcionImprimir(varNum1);
     
              
    }
    
    public static int funcionVerificar(){
        Scanner sc = new Scanner(System.in);
        int varNum;
        do {
        
        
        System.out.println("Ingrese un número del 1 al 20");
        varNum= sc.nextInt();
        } while ((varNum<1||varNum>20));
        return varNum;
    
    }
    
    public static void funcionImprimir(int x){
        System.out.print(x);
        for (int i = 0; i < x; i++) {
            System.out.print("*");
         }
        System.out.println("");
        
    }
}
