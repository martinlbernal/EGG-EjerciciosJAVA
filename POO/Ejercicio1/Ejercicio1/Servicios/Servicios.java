package Servicios;

import java.util.Scanner;

import Entidades.Libro;

public class Servicios {
	public static void main(String[] args) {
		
		Libro libro = new Libro();
		Scanner sc = new Scanner(System.in);
	

	String salida="S";
	int opcion;
	
	do {
		System.out.println("Ingrese la opción deseada: " 
				+ "\n 1: Cargar un libro"
				+ "\n 2: Ver datos del libro"
				+ "\n 3: Salir");
		opcion=sc.nextInt();
		switch (opcion) {
		case 1: {
			libro.cargarLibro();
			break;
			
		}
		case 2:{
			libro.mostrarLibro();
			break;
		}
		case 3:{
			System.out.println("Esta seguro que desea salir? S/N");
			salida=sc.next();
			break;
		}	
		default:{
			System.out.println("Ingreso una opcion equivocada");
			break;
		}
		}
		}while((!salida.equalsIgnoreCase("S")||(!salida.equalsIgnoreCase("s"))));
		
		
			
	
	System.out.println("FIN");
	
	}


}
	


	
	
	
	
	



