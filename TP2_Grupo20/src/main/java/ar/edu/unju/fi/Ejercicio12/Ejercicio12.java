package ar.edu.unju.fi.Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double h,t,g=9.81;
		System.out.print("Ingrese altura: ");
		h= teclado.nextDouble();
		t=Math.sqrt((2*h)/g); //Math.sqrt devuelve la raiz cuadrada redondeada correctamente de un valor double.
		t=Math.round(t*100.0)/100.0;
		System.out.println("El tiempo que tarda en caer es: "+t);
		teclado.close();
	}

}
