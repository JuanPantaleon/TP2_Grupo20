package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal {

	public static void main(String[] args) {
	//	SpringApplication.run(Tp2Grupo20Application.class, args);
		
		 Scanner scanner = new Scanner (System. in);
	        System.out.print("ingrese un numero: ");
	        int numero = scanner.nextInt ();
	        int factorial = 1;
	        while (numero<=10 && numero>0) {
	            factorial = factorial * numero;
	            numero--;
	            }
	        if (numero>=0 && numero<=10) {
	            System.out.println("El factorial del numero es:" + factorial);
	        }
	        else {
	            System.out.println("El numero no esta dentro del rango");
	        }
	        scanner.close();
	}
	
}
