package Ejercicio16;

import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */


public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
       String varCadena="";
       int varContador = 1;
       
        System.out.println("Ingrese una cadena de texto. "
        +"Su cadena debe contener los siguientes requisitos\n"
        +"Máximo de 5 caracteres\n"
        +"El primer caracter debe ser X\n"
        +"El último debe ser O");
             varCadena=sc.next();
             
             if (varCadena.equals("&&&&&")){
                System.out.println("Correcto");
                
             }else if ((varCadena.substring(0,1).equals("x")) && (varCadena.substring(4).equals("o")) && (varCadena.length()==5))  {
                    System.out.println("Correcto"); 
                     }else{
                 do {
                     System.out.println("Error, la primera letra debe ser una x y la última una o");
                     varCadena=sc.next();
                varContador=varContador + 1;
             } while ((!varCadena.substring(0,1).equals("x")) && (!varCadena.substring(5).equals("o")) && (varCadena.length()!=5));
                 
             }             
             System.out.println("Ud. ingresó "+varContador+ " cadenas. Su cadena correcta fue: " +varCadena);
}}
          