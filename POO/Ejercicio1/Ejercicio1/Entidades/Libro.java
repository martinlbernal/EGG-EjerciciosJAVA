package Entidades;

import java.util.Scanner;

/*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/

public class Libro {
	
		
	
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libro() {
		
	}
	
	public Libro(int iSBN, String titulo, String autor, int numPaginas) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void cargarLibro() {
		
		System.out.println("Ingrese el ISBN del libro");
		this.ISBN = sc.nextInt();
		System.out.println("");
		System.out.println("Ingrese el numero de paginas del libro");
		this.numPaginas = sc.nextInt();
		System.out.println("");
		System.out.println("Ingrese el autor del libro");
		this.autor = sc.next();
		System.out.println("");
		System.out.println("Ingrese el titulo del libro");
		this.titulo = sc.next();
	}
	
	public void mostrarLibro() {
		System.out.println("El ISBN del libro es: "+this.ISBN
				+ "El numero de paginas del libro es: "+this.numPaginas
				+ "El autor del libro es: "+this.autor
		        + "El titulo del libro es: "+this.titulo); 
		
	}
}


