package Servicios;

import java.util.Scanner;

import Entidades.Rectangulos;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2.*/

public class Servicios {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	Rectangulos rectangulo = new Rectangulos();
	
	crearRectangulo(rectangulo, sc);	
	calcularPerimetro(rectangulo);
	calcularSuperficie(rectangulo);
	dibujarRectangulo(rectangulo);
	
	
		
}
public static void crearRectangulo (Rectangulos rectangulo, Scanner sc) {
	System.out.println("Ingrese la base del rectangulo");
	rectangulo.setBase(sc.nextDouble());
	System.out.println("Ingrese la altura del rectangulo");
	rectangulo.setAltura(sc.nextDouble());
	
}

public static void calcularSuperficie(Rectangulos rectangulo) {
	System.out.println("La superficie es: "+rectangulo.getBase()*rectangulo.getAltura());
}

public static void calcularPerimetro(Rectangulos rectangulo) {
	System.out.println("El perímetro es: "+(rectangulo.getBase()+rectangulo.getAltura()*2));
}

public static void dibujarRectangulo(Rectangulos rectangulo) {
	for (int i = 0; i < rectangulo.getBase(); i++) {
		System.out.print("*");
	}
	System.out.println();
	

	
			
			for (int i = 0; i < rectangulo.getAltura()-2; i++) {
				System.out.print("*");
				for (int j = 0; j < rectangulo.getAltura()-2; j++) {
					System.out.print(" ");
			}
				System.out.println("*");
			}
	
	
			for (int i = 0; i < rectangulo.getBase(); i++) {
				System.out.print("*");
			}

	

		
	}

}


