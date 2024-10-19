package ejerciciosAdicionales;

import java.util.Scanner;

public class ejerciciosAdicionales2 {

	public static void main(String[] args) {
		/*2. Escribe un programa que pida un número por teclado y pregunte si quiere poner
		más. El programa mostrará el mayor número introducido y el menor, la suma de los
		positivos y negativos, suma de los pares e impares, cantidad de positivos y
		negativos, cantidad de pares e impares y media de todos los números.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero: ");
		int n1 = sc.nextInt();

		System.out.println("¿Quieres continuar poniendo numeros? ");
		String n1NextLine = sc.nextLine();
		do {
			System.out.println("Dime un numero: ");
			int n2 = sc.nextInt();
		} while (n1NextLine == "no");
		System.out.println("vale entonces hasta aqui");

	
		}
	}

