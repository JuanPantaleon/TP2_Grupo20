package ar.edu.unju.fi.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//b1
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.of(2011,6,26), LocalDate.of(2018,12,9));
		System.out.println("Fecha 1: "+pf1.getFecha1());
		System.out.println("Fecha 2: "+pf1.getFecha2()+"\n");
		//b2
		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(5, 25), LocalTime.of(8, 30));
		pf2.setTime1(LocalTime.of(pf2.getTime1().getHour()+5, pf2.getTime1().getMinute()));
		pf2.setTime2(LocalTime.of(pf2.getTime2().getHour(), pf2.getTime2().getMinute()-20));
		System.out.println("Hora 1: "+pf2.getTime1());
		System.out.println("Hora 2: "+pf2.getTime2()+"\n");
		//b3
		System.out.println(pf1.compararFechas()+"\n");
		//b4
		ProcesoFecha pf3 = new ProcesoFecha(LocalDateTime.of(LocalDate.of(2001, 8, 25),LocalTime.of(20, 45)),LocalDateTime.of(LocalDate.of(2003, 6, 27),LocalTime.of(2, 46)));
		System.out.println("Dia y Hora 1: "+pf3.getDateTime1());
		System.out.println("Dia y Hora 2: "+pf3.getDateTime2()+"\n");
		//b5
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(2001, 8, 25), LocalDate.now());
		Period fecha = pf4.contarTiempoTranscurido();
		System.out.println("Han transcurrido "+fecha.getYears()+" años, "+fecha.getMonths()+" meses y "+fecha.getDays()+" desde la fecha "+pf4.formatearFecha(pf4.getFecha1())+" hasta la fecha "+pf4.formatearFecha(pf4.getFecha2())+" \n");
		//b6
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter formato=null;
		LocalDate fechaFormateada=null;
		String fechaStr=null;
		boolean n=true; 
		do {
			n = false;
			try {
				System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
				fechaStr = teclado.next();
				formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				fechaFormateada = LocalDate.parse(fechaStr, formato);
			} catch (DateTimeParseException e) {
				n = true;
				teclado.nextLine();
			}
		}while (n);
		System.out.println("En LocalDate: "+fechaFormateada);
		//pf5
		ProcesoFecha pf5 = new ProcesoFecha();
		pf5.setFecha1(LocalDate.of(2015, 10, 11));
		LocalDate fechaNueva = pf5.getFecha1().plusDays(365);
		System.out.println("\nFecha anterior: "+pf5.getFecha1());
		System.out.println("Fecha nueva: "+fechaNueva+"\n");
		//fecha2
		n=true;
		do {
			n=false;
			try {
				System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
				fechaStr = teclado.next();
				formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				pf5.setFecha2(LocalDate.parse(fechaStr, formato));
			} catch (DateTimeParseException e) {
				n = true;
				teclado.nextLine();
			}
		} while (n);
		pf5.setFecha2(pf5.getFecha2().plusMonths(6));
		System.out.println("Fecha nueva: "+pf5.getFecha2());
		teclado.close();
	}
}
