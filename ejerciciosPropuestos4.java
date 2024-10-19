package ejerciciosPropuestos;

import java.util.Scanner;

public class ejerciciosPropuestos4 {

	public static void main(String[] args) {
		/*Ejercicio: Se desea conocer el lucky number (número de la suerte) de cualquier persona.
		Dicho número se consigue reduciendo la fecha de nacimiento a un número de solo un dígito.
		Por ejemplo, la fecha de nacimiento de Emma es: 16-08-1973 → 16 + 8 + 1973 =1997 → 1 + 9
		+ 9 + 7 = 26 → 2 + 6 = 8. El número de la suerte de Emma será el 8*/
		Scanner sc = new Scanner(System.in); 


		System.out.println("Por favor, dime tu año de nacimiento"); 

		String anyoNextLine = sc.nextLine(); 

		int anyo = Integer.parseInt(anyoNextLine); 

		 

		System.out.println("Por favor, dime tu mes de nacimiento"); 

		String mesNextLine = sc.nextLine(); 

		int mes = Integer.parseInt(mesNextLine); 

		 

		System.out.println("Por favor, dime tu día de nacimiento"); 

		String diaNextLine = sc.nextLine(); 

		int dia = Integer.parseInt(diaNextLine); 

		 

		int suma = anyo + mes + dia; 

		 

		if (suma >= 1000 && suma <= 9999) { 

			int n1 = suma / 1000; 

			int n2 = (suma/100)%10; 

			int n3 = (suma/10)%10; 

			int r1 = n1 + n2 + n3; 

			System.out.println("Tu número de la suerte es: " +r1); 

			 

			if (r1>=10) { 

				int n4 = r1/10; 

				int n5 = (r1 /10)%10; 

				int r2 = n4 + n5; 

				System.out.println("Tu número de la suerte es: " + r2); 

			} 

				 

			 

		} 
		sc.close();
	}

}
