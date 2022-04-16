package ar.edu.unju.fi.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char opc= 's';
		int mes=0;
		
		while(opc=='s')
		{	
			System.out.print("Ingrese un mes: ");
			mes = teclado.nextInt();
			switch(mes) {
			case 1: 
				System.out.println("El numero corresponde a ENERO");
				break;
			case 2: 
				System.out.println("El numero corresponde a FEBRERO");
				break;
			case 3:
				System.out.println("El numero corresponde a MARZO");
				break;
			case 4:
				System.out.println("El numero corresponde a ABRIL");
				break;
			case 5:
				System.out.println("El numero corresponde a MAYO");
				break;
			case 6:
				System.out.println("El numero corresponde a JUNIO");
				break;
			case 7:
				System.out.println("El numero corresponde a JULIO");
				break;
			case 8:
				System.out.println("El numero corresponde a AGOSTO");
				break;
			case 9:
				System.out.println("El numero corresponde a SEPTIEMBRE");
				break;
			case 10:
				System.out.println("El numero corresponde a OCTUBRE");
				break;
			case 11:
				System.out.println("El numero corresponde a NOVIEMBRE");
				break;
			case 12:
				System.out.println("El numero corresponde a DICIEMBRE");
				break;
				default: 
					System.out.println("NO EXISTE ESE MES");
			}
			System.out.print("Desea ingresar otro mes? s/n: ");
			opc = teclado.next().charAt(0);
		}
		teclado.close();
	}

}
