package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año=teclado.nextInt();

        if(año%4==0 && año%100!=0) {
            System.out.println("El año es bisiesto");
        }else {
            System.out.println("El año no es bisiesto");
        }

        teclado.close();
    }

}