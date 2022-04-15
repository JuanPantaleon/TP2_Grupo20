package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero=1;
		System.out.println("El ingreso termina con valores menores a 0");
		while(numero>=0) {
			boolean n=false;
			do {
				n=false;
				try {
					System.out.print("Ingrese un numero: ");
					numero = teclado.nextInt();
				} catch (Exception e) {
					n=true;
					teclado.nextLine();
				}
			}while(n);

			if(numero>=7 && numero<=10){
				System.out.println("El alumno promociona");
			}else {
				if(numero==6){
					System.out.println("El alumno regulariza");
				}else{
					if(numero>=1&&numero<6){
						System.out.println("El alumno desaprueba");
					}else{
						if(numero < 0) {
							System.out.println("Valor no permitido");
						}
					}
				}
			}
		}

		teclado.close();
	}
}
