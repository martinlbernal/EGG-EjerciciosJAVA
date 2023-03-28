package Entidades;

import java.util.Scanner;

public class Cafetera {
private double capacidadMaxima;
private double capacidadActual;
Scanner sc = new Scanner(System.in);

public Cafetera() {
	
}

public Cafetera(double capacidadMaxima, double capacidadActual) {
	super();
	this.capacidadMaxima = capacidadMaxima;
	this.capacidadActual = capacidadActual;
}

public double getCapacidadMaxima() {
	return capacidadMaxima;
}

public void setCapacidadMaxima(double capacidadMaxima) {
	this.capacidadMaxima = capacidadMaxima;
}

public double getcapacidadActual() {
	return capacidadActual;
}

public void setCapacidadActual(double capacidadActual) {
	this.capacidadActual = capacidadActual;
}

public  void llenarCafetera(Cafetera cafetera, Scanner sc) {
cafetera.setCapacidadActual(10);
cafetera.capacidadMaxima=cafetera.getcapacidadActual();
	
}

public  void servirTaza(Cafetera cafetera, Scanner sc) {
	System.out.println("Ingrese el tamaño de su taza, en relación 1-10");
	int tamaño=sc.nextInt();
	
	if (tamaño>cafetera.getCapacidadMaxima()) {
		System.out.println("Solo puede servirse "+(tamaño-cafetera.capacidadMaxima)+" cc de café, ya que no tenemos el café suficiente para su taza");
		}else {
			System.out.println("Usted llenó su taza de café");
			cafetera.setCapacidadMaxima(-tamaño);
		}
	
	
	
	
	
}

public void vaciarCafetera(Cafetera cafetera) {
	cafetera.setCapacidadActual(0);
}

public  void agregarCafe(Cafetera cafetera, Scanner sc) {
System.out.println("Ingrese la cantidad de café que agregará");
cafetera.setCapacidadActual(sc.nextDouble());
cafetera.capacidadMaxima=cafetera.getcapacidadActual();
System.out.println("Su cafetera tiene "+cafetera.getcapacidadActual()+" de litros de cafe");
}

}




