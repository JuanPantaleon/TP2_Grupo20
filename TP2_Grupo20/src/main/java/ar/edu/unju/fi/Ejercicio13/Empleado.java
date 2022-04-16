package ar.edu.unju.fi.Ejercicio13;

import java.time.LocalDate;

public class Empleado {
	public String nombre;
	public LocalDate fecha_ingreso;
	public int legajo;
	public String mail;
	public int sueldo;
	public int horas_trabajadas;
	
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre, LocalDate fecha_ingreso, int legajo, String mail, int sueldo,
			int horas_trabajadas) {
		super();
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.legajo = legajo;
		this.mail = mail;
		this.sueldo = sueldo;
		this.horas_trabajadas = horas_trabajadas;
	}

	public Empleado(String nombre, int legajo, int horas_trabajadas) {
		super();
		this.fecha_ingreso= LocalDate.of(1900,01,01);
		this.nombre = nombre;
		this.legajo = legajo;
		this.horas_trabajadas = horas_trabajadas;
	}

	public Empleado(String nombre, LocalDate fecha_ingreso, int horas_trabajadas) {
		super();
		this.legajo=-9999;
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.horas_trabajadas = horas_trabajadas;
	}

	public Empleado(String nombre, int horas_trabajadas) {
		super();
		this.fecha_ingreso=LocalDate.of(1900,01,01);
		this.legajo=-9999;
		this.nombre = nombre;
		this.horas_trabajadas = horas_trabajadas;
	}
	
	
	
}
