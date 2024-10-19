package holaMundo;

import java.util.Scanner;

public class ejercicioBasico9 {

	public static void main(String[] args) {
// 9. Programa que lea tres números enteros H, M, S que contienen hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
		Scanner sc = new Scanner(System.in); 
		 

		System.out.println("Por favor, dime un número"); 

		int h = sc.nextInt(); 

		 

		System.out.println("Por favor, dime otro número"); 

		int m = sc.nextInt(); 

		 

		System.out.println("Por favor, dime otro número"); 

		int s = sc.nextInt(); 

		 

		 

		if (h>=0 && h<=23) { 

			System.out.println("La hora es " +h); 

		}else { 

			System.out.println("No es una hora válida"); 

		} 

		if (m>=0 && m<=59) { 

			System.out.println("Los minutos son " +m); 

		}else { 

			System.out.println("No son unos minútos válidos"); 

		} 

		if (s>=0 && s<=59) { 

			System.out.println("Los segundos son " +s); 

		}else { 

			System.out.println("No son unos segundos válidos"); 

		} 
		sc.close();
	}

}
