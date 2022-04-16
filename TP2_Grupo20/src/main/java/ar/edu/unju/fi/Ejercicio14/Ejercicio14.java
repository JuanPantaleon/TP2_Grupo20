package ar.edu.unju.fi.Ejercicio14;

import java.time.LocalDate;

import ar.edu.unju.fi.Ejercicio13.Empleado;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado= new Empleado();
		Empleado empleado1= new Empleado("Ezequiel",444,165);
		Empleado empleado2= new Empleado("Ezequiel",LocalDate.of(2022, 04, 16),165);
		Empleado empleado3= new Empleado("Ezequiel",161);
		
		System.out.println("Nombre: "+empleado.nombre+","+" Fecha de Ingreso: "+empleado.fecha_ingreso+","+" Legajo: "+empleado.legajo+","+" Mail: "+empleado.mail+","+" Sueldo: "+empleado.sueldo+","+" Horas trabajadas: "+empleado.horas_trabajadas);
		System.out.println("Nombre: "+empleado1.nombre+","+" Legajo: "+empleado1.legajo+","+" Horas trabajadas: "+empleado1.horas_trabajadas);
		System.out.println("Nombre: "+empleado2.nombre+","+" Fecha de Ingreso: "+empleado2.fecha_ingreso+","+" Horas trabajdas: "+empleado2.horas_trabajadas);
		System.out.println("Nombre: "+empleado3.nombre+","+" Horas trabajadas: "+empleado3.horas_trabajadas);
	}
	
}
