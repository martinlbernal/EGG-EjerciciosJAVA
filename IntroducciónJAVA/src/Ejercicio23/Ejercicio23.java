/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicio23;

import java.util.Scanner;


public class Ejercicio23 {

    
    public static void main(String[] args) {
       
        int [] vectorCreado= crearVector();
        llenarVector(vectorCreado);
        recorrerVector(vectorCreado);
        
        
        
    }
    public static int [] crearVector(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int varTamano= sc.nextInt();
        int [] vector = new int [varTamano];
        return vector;
    }
    
    public static void llenarVector(int[] x){
        for (int i = 0; i < x.length; i++) {
            x[i]=(int) (Math.random() * 10000) + 1;
            System.out.println(x[i]);  
        }
        
    }
    
    public static void recorrerVector(int []x){
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        
        for (int i = 0; i < x.length; i++) {
            if (x[i]>0 & x[i]<=9) {
                contador1++;
                }
            if (x[i]>=10 & x[i]<=99) {
                contador2++;
                }
            if (x[i]>=100 & x[i]<=999) {
                contador3++;
                }
            if (x[i]>=1000 & x[i]<=9999) {
                contador4++;
                }
            if (x[i]>=10000 & x[i]<=99999) {
                contador5++;
                }
            
                      
        }
        System.out.println("El vector se llenó con: \n"
                + +contador1+ " números de 1 dígito \n"
                + +contador2+ " números de 2 dígitos \n"
                + +contador3+ " números de 3 dígitos \n"
                + +contador4+ " números de 4 dígitos \n"
                + +contador5+ " números de 5 dígitos \n"
        );
    }
    
}
