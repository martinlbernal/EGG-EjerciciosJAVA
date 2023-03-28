package Servicios;


import java.util.Scanner;

import Entidades.Circunferencia;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 * 
 * */


public class Servicios {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circunferencia circunferencia= new Circunferencia();
	

		crearCircunferencia(sc, circunferencia);
		double area=area(circunferencia);
		double perimetro=perimetro(circunferencia);
		mostrarDatos(circunferencia, area, perimetro);
		
	}		
	public static void crearCircunferencia(Scanner sc, Circunferencia circunferencia) {
		System.out.println("Ingrese el radio");
		circunferencia.setRadio(sc.nextDouble());	
			
		}			
	
	
	
	
	public static double area(Circunferencia circunferencia) {
		double area = 3.14 * circunferencia.getRadio();
		return area;
	}
	
	public static double perimetro(Circunferencia circunferencia) {
		double perimetro= 2*3.14*circunferencia.getRadio();
		return perimetro;
	}
	
	public static void mostrarDatos(Circunferencia circunferencia, double area, double perimetro) {
		System.out.println("La circunferencia tiene estos valores"
				+ "\n radio:"+circunferencia.getRadio()
				+ "\n area: "+area
				+ "\n perimetro: "+perimetro);
	}

}
