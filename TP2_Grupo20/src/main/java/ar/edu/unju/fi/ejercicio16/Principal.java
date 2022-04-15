package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int n=teclado.nextInt();
		
		CalculoMatematico calculo = new CalculoMatematico(n);
		System.out.println("La sumatoria es: "+calculo.CalcularSumatoria());
		System.out.println("La productoria es: "+calculo.CalcularProductoria());
		
		teclado.close();
	}
}
