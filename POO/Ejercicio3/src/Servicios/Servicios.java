package Servicios;

import java.util.Scanner;

import Entidades.Operaciones;

/*Crear una clase llamada Operacion que tenga como atributos privados el numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
16
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.*/

public class Servicios {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1;
		int num2;
		Operaciones operaciones= new Operaciones();
		
		crearOperacion(operaciones, sc);
		mostrarResultados(operaciones);
		
	}
	
	public static void crearOperacion(Operaciones operaciones, Scanner sc) {
		System.out.println("Ingrese el valor numero 1");
		operaciones.setNumero1(sc.nextInt());
		System.out.println("Ingrese el valor numero 2");
		operaciones.setNumero2(sc.nextInt());
	}
	
	public static int sumar(Operaciones operaciones) {
		return (operaciones.getNumero1()+operaciones.getNumero2());
	}
	
	public static int restar(Operaciones operaciones) {
		int num1=0;
		int num2=0;
		if (operaciones.getNumero1()>operaciones.getNumero2()) {
			num1=operaciones.getNumero1();
			num2=operaciones.getNumero2();
		
	}else if (operaciones.getNumero1()<operaciones.getNumero2()){
		num1=operaciones.getNumero2();
		num2=operaciones.getNumero1();
		
	}return (num1-num2); 
	}

	
	public static int multiplicar(Operaciones operaciones) {
		return (operaciones.getNumero1()*operaciones.getNumero2());
	}
	
	public static int dividir(Operaciones operaciones) {
		if (operaciones.getNumero1()==0 || operaciones.getNumero2()==0) {
			System.out.println("No se puede dividir");
			return 0;
		}
		return (operaciones.getNumero1()/operaciones.getNumero2());
	}
	
	public static void mostrarResultados(Operaciones operaciones) {
		System.out.println("El resultado de la suma es: "+sumar(operaciones)
				+"\n El resultado de la resta es: "+restar(operaciones)
				+"\n El resultado de la division es: "+dividir(operaciones)
				+"\n El resultado de la multiplicacion es: "+multiplicar(operaciones));
	}
	
	
	
	

}
 