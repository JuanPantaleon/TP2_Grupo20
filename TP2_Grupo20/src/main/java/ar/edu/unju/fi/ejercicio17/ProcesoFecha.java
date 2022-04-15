package ar.edu.unju.fi.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
	LocalDate fecha1;
	LocalDate fecha2;
	LocalTime time1;
	LocalTime time2;
	LocalDateTime dateTime1;
	LocalDateTime dateTime2;
	
	public ProcesoFecha() {
		// TODO Auto-generated constructor stub
	}

	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	}

	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	public LocalDate getFecha1() {
		return fecha1;
	}

	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}

	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	public LocalTime getTime1() {
		return time1;
	}

	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	public LocalTime getTime2() {
		return time2;
	}

	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	public LocalDateTime getDateTime1() {
		return dateTime1;
	}

	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	public LocalDateTime getDateTime2() {
		return dateTime2;
	}

	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	public Period contarTiempoTranscurido() {
		Period fecha=null;
		fecha = Period.between(this.fecha1, this.fecha2);
		return fecha;
	}
	
	public String formatearFecha(LocalDate fecha) {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formateador.format(fecha);
	}
	
	public String compararFechas() {
		if(this.fecha1.isAfter(this.fecha2)) {
			return "La fecha "+formatearFecha(this.fecha1)+" es posterior a la fecha "+formatearFecha(this.fecha2);
		}else {
			if(this.fecha1.isBefore(this.fecha2)) {
				return "La fecha "+formatearFecha(this.fecha1)+" es anterior a la fecha "+formatearFecha(this.fecha2);
			}else {
				return "Las fechas son iguales";
			}
		}
	}
	
	
	
}


