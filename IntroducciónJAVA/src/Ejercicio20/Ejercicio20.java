/*

 */
package Ejercicio20;

import java.util.Scanner;

/**
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es: 
* 0.86 libras es un 1 € 
* 1.28611 $ es un 1 € 
* 129.852 yenes es un 1 €
 */
public class Ejercicio20 {

    
    public static void main(String[] args) {
     int x=0;   
     funcionConvertir(x);   
        
    }
    
    public static void funcionConvertir(int a){
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduzca la cantidad de Euros que desea convertir:");
        int varCantidad= sc.nextInt();
        System.out.println("A qué moneda desea convertirlo?\n"
                + "Digite 1 si quiere Dolares\n"
                + "Digite 2 si quiere Libras\n"
                + "Digite 3 si quiere Yenes\n"
                + "Digite 4 si quiere SALIR");
        int varOption= sc.nextInt();
        String varEleccion="S";
        
         switch (varOption) {
                case 1:
                    System.out.println("La conversión es: " + (varCantidad * 1.28611)+ " dolares");
                    break;
                case 2:
                    System.out.println("La conversión es: " + (varCantidad * 0.86) + " libras");
                    break;
                case 3:
                    System.out.println("La conversión es: " + (varCantidad * 129.852) + " yenes");
                    break;
                case 4:
                    System.out.println("Esta seguro que desea salir? (S/N");
                    varEleccion = sc.next();
                    break;
                default:
                    System.out.println("Debe ingresar una opción válida");
            }
              
    
    }
    
}
