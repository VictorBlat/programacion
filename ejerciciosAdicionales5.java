package ejerciciosAdicionales;

import java.util.Scanner;

public class ejerciciosAdicionales5 {

	public static void main(String[] args) {
		/*5. Escribe un programa que pida por teclado dos números y genere 10 números
		aleatorios entre esos números. Usa el método Math.random para generar un
		número entero aleatorio.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un número: ");
		String n1Nextline = sc.nextLine();
		int n1 = Integer.parseInt(n1Nextline);
		System.out.println("introduzca un número: ");
		String n2Nextline = sc.nextLine();
		int n2 = Integer.parseInt(n2Nextline);
		//int n1 = 1;
		//int n2 = 10;
		int contador = 0;
		do {
			double a = n1+Math.random()*n2-n1;
			int b = (int) Math.round(a);
			System.out.println(b);
			contador ++;
		} while (contador < 10);
		
		sc.close();
		
	}

}
