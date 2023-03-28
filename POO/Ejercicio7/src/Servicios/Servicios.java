package Servicios;

import java.util.Scanner;

import Entidades.Persona;

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.*/

public class Servicios {
	
	
	public static void main(String[] args) {
		Persona persona = new Persona();
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		Scanner sc = new Scanner(System.in);
		
		
		
		
		persona1.crearPersona(persona, sc);
		persona1.calcularIMC(persona);
		persona1.esMayorDeEdad(persona);
		
		
		persona2.crearPersona(persona, sc);
		persona2.calcularIMC(persona);
		persona2.esMayorDeEdad(persona);
		
		persona3.crearPersona(persona, sc);
		persona3.calcularIMC(persona);
		persona3.esMayorDeEdad(persona);
		
		persona4.crearPersona(persona, sc);
		persona4.calcularIMC(persona);
		persona4.esMayorDeEdad(persona);
		
		
		cantidadEdad(persona);
		cantIMC(persona);
		
	}
	
	
	public static void cantidadEdad (Persona persona) {
		System.out.println("Son "+persona.getContadorMayE()+" las personas mayores de edad"+"Representan el "+25*persona.getContadorMayE()+"% del total");
		System.out.println("Son "+persona.getContadorMenE()+" las personas menores de edad"+"Representan el "+25*persona.getContadorMenE()+"% del total");
			
	}
	
	public static int cantIMC(Persona persona) {
		
		
		System.out.println("Son "+persona.getContMen20()+" las personas con menos de 20 de IMC"+"Representan el "+25*persona.getContMen20()+"% del total");
		System.out.println("Son "+persona.getContMay20()+" las personas con menos de 20 de IMC"+"Representan el "+25*persona.getContMay20()+"% del total");
		System.out.println("Son "+persona.getContMay25()+" las personas con menos de 20 de IMC"+"Representan el "+25*persona.getContMay25()+"% del total");
		return 0;
	}

}
