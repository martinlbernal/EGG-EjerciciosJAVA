package Ejercicio14;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir una
 * opción y el programa deberá mostrar el resultado por pantalla y luego volver
 * al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener
 * en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número positivo");
        int varNum1 = sc.nextInt();
        System.out.println("Ingrese otro número positivo");
        int varNum2 = sc.nextInt();
        String varEleccion="";
        
        do {
            System.out.println("Qué desea hacer:"
                    + "1: Sumar\n"
                    + "2: Restar\n"
                    + "3: Multiplicar\n"
                    + "4: Dividir\n"
                    + "5: Salir");
            int varOption = sc.nextInt();
            switch (varOption) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (varNum1 + varNum2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (varNum1 - varNum2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (varNum1 * varNum2));
                    break;
                case 4:
                    System.out.println("El resultado de la división es: " + (varNum1 / varNum2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? (S/N");
                    varEleccion = sc.next();
                    break;
                default:
                    System.out.println("Debe ingresar una opción válida");
            }
        } while (!varEleccion.equalsIgnoreCase("S"));
        System.out.println("Gracias por utilizar nuestro servicio");
    }
}

    
