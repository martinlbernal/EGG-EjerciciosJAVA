package Entidades;

import java.util.Scanner;

public class Cuenta {
	private int numCuenta;
	private int dni;
	private double saldoActual;
	
	Scanner sc = new Scanner(System.in);
	public Cuenta() {
		
	}

	public Cuenta(int numCuenta, int dni, double saldoActual) {
		
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldoActual = 0;
	}
	
	
	
	public void crearCuenta(Cuenta cuenta, Scanner sc) {
		System.out.println("Ingrese el numero de cuenta");
		cuenta.numCuenta=sc.nextInt();
		System.out.println("Ingrese el DNI del titular");
		cuenta.dni=sc.nextInt();
		
		
	}
	
	public void ingresar(Cuenta cuenta, Scanner sc) {
		System.out.println("Ingrese la cantidad de dinero a depositar");
		double ingreso=sc.nextDouble();
		cuenta.saldoActual+=ingreso;
	}
	
	public void retirar(Cuenta cuenta, Scanner sc) {
		System.out.println("Ingrese la cantidad de dinero a retirar");
		double retiro=sc.nextDouble();
		if (cuenta.saldoActual< retiro) {
			cuenta.saldoActual=0;
		}else {
			cuenta.saldoActual-=retiro;
		}
		
	}
	
	public void extraccionRapida(Cuenta cuenta, Scanner sc) {
		System.out.println("Ingrese la cantidad de dinero a retirar rápidamente");
		double retiro=sc.nextDouble();
		cuenta.saldoActual-=(cuenta.saldoActual*0.2);
		if (retiro>cuenta.saldoActual*0.2) {
			System.out.println("No dispone de ese dinero para retirar");
		}
	}
	
	public void consultarSaldo(Cuenta cuenta) {
		System.out.println("El saldo de tu cuenta es: "+cuenta.saldoActual);
	}

	public void mostrarDatos(Cuenta cuenta) {
		System.out.println("Su numero de cuenta es: "+cuenta.numCuenta);
		System.out.println("Su numero de dni es: "+cuenta.dni);
		System.out.println("Su saldo es: "+cuenta.saldoActual);
		
	}
}

