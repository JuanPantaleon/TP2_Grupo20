package ar.edu.unju.fi.ejercicio4;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		boolean n=false;int mes=0;

		do {
			n=false;
			try {
				System.out.print("Ingrese un mes: ");
				mes = teclado.nextInt();
			} catch (InputMismatchException e) {
				n=true;
				teclado.nextLine();
			}

		}while(n);

		if(mes>0 && mes<=12)
			if(mes==1){

			}else {
				if(mes==1){
					System.out.println("El numero corresponde a Enero");
				}else {
					if(mes==2){
						System.out.println("El numero corresponde a Febrero");
					}else {
						if(mes==3){
							System.out.println("El numero corresponde a Marzo");
						}else {
							if(mes==4){
								System.out.println("El numero corresponde a Abril");
							}else {
								if(mes==5){
									System.out.println("El numero corresponde a Mayo");
								}else {
									if(mes==6){
										System.out.println("El numero corresponde a Junio");
									}else {
										if(mes==7){
											System.out.println("El numero corresponde a Julio");
										}else {
											if(mes==8){
												System.out.println("El numero corresponde a Agosto");
											}else {
												if(mes==9){
													System.out.println("El numero corresponde a Septiembre");
												}else {
													if(mes==10){
														System.out.println("El numero corresponde a Octubre");
													}else {
														if(mes==11){
															System.out.println("El numero corresponde a Noviembre");
														}else {
															if(mes==12){
																System.out.println("El numero corresponde a Diciembre");
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		else
			System.out.println("No existe ese mes");

		teclado.close();
	}

}
