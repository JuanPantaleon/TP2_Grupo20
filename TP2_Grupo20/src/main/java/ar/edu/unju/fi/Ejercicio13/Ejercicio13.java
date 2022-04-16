package ar.edu.unju.fi.Ejercicio13;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleados=new Empleado(null, null, 0, null, 0, 0);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		empleados.nombre = entrada.next();
		System.out.print("Ingrese fecha ingreso en formato 'yyyy-mm-dd': ");
		String fechaStr = entrada.next();
		empleados.fecha_ingreso = LocalDate.parse(fechaStr);
		System.out.print("Ingrese legajo: ");
		empleados.legajo = entrada.nextInt();
		System.out.print("Ingrese mail: ");
		empleados.mail = entrada.next();
		System.out.print("Ingrese Horas trabajadas: ");
		empleados.horas_trabajadas = entrada.nextInt();
		if(empleados.horas_trabajadas<=160) {
			empleados.sueldo=600*empleados.horas_trabajadas;
		}else {
			empleados.sueldo=600*160;
			for(int i=161;i<=empleados.horas_trabajadas;i++) {
				empleados.sueldo+=650;
			}
		}
		System.out.println("Nombre: "+empleados.nombre);
		System.out.println("Fecha de Ingreso: "+empleados.fecha_ingreso);
		System.out.println("Legajo: "+empleados.legajo);
		System.out.println("Mail: "+empleados.mail);
		System.out.println("Sueldo: "+empleados.sueldo);
		System.out.println("Horas trabajadas: "+empleados.horas_trabajadas);
		entrada.close();
	}
}
