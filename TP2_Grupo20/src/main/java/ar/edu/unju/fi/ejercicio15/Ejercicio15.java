package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Fecha de nacimiento (año-mes-dia): ");
		String fecha = teclado.next();
		LocalDate fecha_nacimiento = LocalDate.parse(fecha);

		Persona unaPersona = new Persona(nombre, fecha_nacimiento);
		
		System.out.println("");
		unaPersona.CalcularEdad();
		unaPersona.CalcularSigno();
		unaPersona.CalcularEstacion();

		teclado.close();	
	}
}
