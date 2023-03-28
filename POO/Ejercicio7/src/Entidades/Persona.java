package Entidades;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private int edad;
	private String sexo;
	private double peso;
	private double altura;

	private final int MENORA20 = -1;
	private final int MAS20 = 0;
	private final int MAS25 = 1;
	
	int contadorMayE=0;
	int contadorMenE=0;
	
    int contMen20=0;
	int contMay20=0;
	int contMay25=0;
	

	public int getContadorMayE() {
		return contadorMayE;
	}

	public void setContadorMayE(int contadorMayE) {
		this.contadorMayE = contadorMayE;
	}

	public int getContadorMenE() {
		return contadorMenE;
	}

	public void setContadorMenE(int contadorMenE) {
		this.contadorMenE = contadorMenE;
	}

	public int getContMen20() {
		return contMen20;
	}

	public void setContMen20(int contMen20) {
		this.contMen20 = contMen20;
	}

	public int getContMay20() {
		return contMay20;
	}

	public void setContMay20(int contMay20) {
		this.contMay20 = contMay20;
	}

	public int getContMay25() {
		return contMay25;
	}

	public void setContMay25(int contMay25) {
		this.contMay25 = contMay25;
	}

	public Persona() {

	}

	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	Scanner sc = new Scanner(System.in);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void crearPersona(Persona persona, Scanner sc) {
		System.out.println("Ingrese el nombre");
		persona.setNombre(sc.next());
		System.out.println("Ingrese la edad");
		persona.setEdad(sc.nextInt());
		System.out.println("Ingrese el sexo");
		persona.setSexo(sc.next());
		if (!persona.getSexo().equalsIgnoreCase("M") && !persona.getSexo().equalsIgnoreCase("F")
				&& !persona.getSexo().equalsIgnoreCase("O")) {
			do {
				System.out.println("El sexo ingresado no es válido, ingrese el sexo nuevamente");
				persona.setSexo(sc.next());
			} while (!persona.getSexo().equalsIgnoreCase("M") && !persona.getSexo().equalsIgnoreCase("F")
					&& !persona.getSexo().equalsIgnoreCase("O"));
		}
		System.out.println("Ingrese el peso");
		persona.setPeso(sc.nextDouble());
		System.out.println("Ingrese la altura");
		persona.setAltura(sc.nextDouble());
	}

	public int calcularIMC(Persona persona) {
		System.out.println("VamoS a calcular que Ud. esté en su peso ideal");
		double pesoIdeal = (persona.getPeso() / (persona.getAltura() * persona.getAltura()));

		if (pesoIdeal < 20) {
			System.out.println("Esta por debajo de 20. DESNUTRIDO");
			persona.setContMen20(+1);
			return persona.MENORA20;
		} else if ((pesoIdeal >= 20) && (pesoIdeal <= 25)) {
			System.out.println("DEBAJO DEL PESO IDEAL");
			persona.setContMay20(+1);
			return persona.MAS20;
		}  else if (pesoIdeal>26){ 
			System.out.println("Esta por encima de 25. SOBREPESO");
			persona.setContMay25(+1);
			return persona.MAS25;
		}
		
		return 0;
		

	}
	
	public boolean esMayorDeEdad(Persona persona) {
		if (persona.getEdad()>21) {
			System.out.println("Es mayor de edad");
			persona.setContadorMayE(+1);
			
		}else {
			System.out.println("Es menor de edad");
			persona.setContadorMenE(+1);
		
	}
		return true;
}
	
	
	
}
