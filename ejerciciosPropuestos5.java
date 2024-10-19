package ejerciciosPropuestos;

import java.util.Scanner;

public class ejerciciosPropuestos5 {

	public static void main(String[] args) {
// Ejercicio: Realiza un programa que muestre por pantalla las tablas de multiplicar del 1 al 10 con el siguiente formato:
		Scanner sc = new Scanner(System.in); 


		System.out.println("Por favor, dime un nuermo"); 

		String anyoNextLine = sc.nextLine(); 

		int i = Integer.parseInt(anyoNextLine);
		System.out.println("Tabla del " + i); 
		System.out.println(i+" x 1 = " + (i*1)); 
		System.out.println(i+" x 2 = " + (i*2));
		System.out.println(i+" x 3 = " + (i*3));
		System.out.println(i+" x 4 = " + (i*4));
		System.out.println(i+" x 5 = " + (i*5));
		System.out.println(i+" x 6 = " + (i*6));
		System.out.println(i+" x 7 = " + (i*7));
		System.out.println(i+" x 8 = " + (i*8));
		System.out.println(i+" x 9 = " + (i*9));
		System.out.println(i+" x 10 = " + (i*10));
		
		sc.close();
	}

}
