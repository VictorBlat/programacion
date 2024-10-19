package ejerciciosAdicionales;

import java.util.Scanner;

public class ejerciciosAdicionales1 {

	public static void main(String[] args) {
		/* Escribe un programa que calcule la nota media de todos los módulos cursados hasta
		el momento por un alumno de DAM. Cada alumno puede tener cursados un número
		diferente de módulos, por tanto, a priori no se sabe el número de notas que habrá
		que ir sumando para luego obtener la media. Al finalizar el programa, se deberá
		mostrar por pantalla el nombre completo del alumno y su nota media.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nota en el primer trimestre: ");
       
		
		String n1NextLine = sc.nextLine();
		int n1=Integer.parseInt(n1NextLine);

		System.out.println("Dime tu nota del segundo trimestre: ");
       
		
		String n2NextLine = sc.nextLine();
		int n2=Integer.parseInt(n2NextLine);
		
		System.out.println("Dime tu nota en el tercer trimestre: ");
       
		String n3NextLine = sc.nextLine();
		int n3=Integer.parseInt(n3NextLine);
		
		int media = ((n1 + n2 + n3)/3);
		System.out.println("Tu nota media es : " +media);
		
		sc.close();
	}

}
