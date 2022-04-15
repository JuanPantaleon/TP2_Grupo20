package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fecha_nacimiento;

	public Persona(String nombre, LocalDate fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + "]";
	}

	public void CalcularEdad(){
		LocalDate fecha_hoy = LocalDate.now();
		Period periodo = Period.between(this.fecha_nacimiento, fecha_hoy);
		System.out.println("Fecha de nacimiento = "+this.fecha_nacimiento);
		System.out.println("Edad "+periodo.getYears()+" años");
	}

	public void CalcularEstacion() {
		int dia = this.fecha_nacimiento.getDayOfMonth();
		int mes = this.fecha_nacimiento.getMonthValue();

		if((mes==12 && dia>=21)||(mes==3 && dia<=20)||(mes<=2)) {
			System.out.println("Estacion Verano");
		}else {
			if((mes==3 && dia>=21)||(mes==6 && dia<=20)||(mes<=5)) {
				System.out.println("Estacion Otoño");
			}else {
				if((mes==6 && dia>=21)||(mes==9 && dia<=20)||(mes<=8)) {
					System.out.println("Estacion Invierno");
				}else {
					System.out.println("Estacion Primavera");
				}
			}
		}
	}

	public void CalcularSigno() {
		int dia = this.fecha_nacimiento.getDayOfMonth();
		int mes = this.fecha_nacimiento.getMonthValue();
		String signo=null;

		switch(mes) {
		case 1:
			if(dia<=19)
				signo="Capricornio";
			else
				signo="Acuario";
			break;
		case 2:
			if(dia<=18)
				signo="Acuario";
			else
				signo="Piscis";
			break;
		case 3:
			if(dia<=20)
				signo="Piscis";
			else
				signo="Aries";
			break;
		case 4:
			if(dia<=19)
				signo="Aries";
			else
				signo="Tauro";
			break;
		case 5:
			if(dia<=21)
				signo="Tauro";
			else
				signo="Géminis";
			break;
		case 6:
			if(dia<=20)
				signo="Géminis";
			else
				signo="Cáncer";
			break;
		case 7:
			if(dia<=22)
				signo="Cáncer";
			else
				signo="Leo";
			break;
		case 8:
			if(dia<=22)
				signo="Leo";
			else
				signo="Virgo";
			break;
		case 9:
			if(dia<=22)
				signo="Virgo";
			else
				signo="Libra";
			break;
		case 10:
			if(dia<=22)
				signo="Libra";
			else
				signo="Escorpio";
			break;
		case 11:
			if(dia<=21)
				signo="Escorpio";
			else
				signo="Sagitario";
			break;
		case 12:
			if(dia<=21)
				signo="Sagitario";
			else
				signo="Capricornio";
			break;
		}
		System.out.println("Signo del Zodiaco: "+signo);
	}
}
