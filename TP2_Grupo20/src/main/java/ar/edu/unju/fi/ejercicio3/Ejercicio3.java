package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bandera = 0;
		System.out.println("Ingrese 5 numeros para daterminar si es par o no");
		Scanner numeros = new Scanner(System.in);
		while (bandera<5) {
			
	        System.out.print("Ingrese un numero: ");
	        int numero=numeros.nextInt();
	        
	        if (numero%2 == 0) {
	        	System.out.println("El numero es par.");
	        	bandera = bandera+1;
	        }
	        else {
	        	System.out.println("El numero es Impar.");
	        	bandera = bandera+1;
	        }
	        
		}numeros.close();
		
	}

}
