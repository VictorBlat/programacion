package ejerciciosAdicionales;

import java.util.Random;
import java.util.Scanner;

public class ejerciciosAdicionales10 {

	public static void main(String[] args) {
		/*10. Escribir un programa que permita adivinar un número. La aplicación genera un
número aleatorio del 1 al 100. A continuación va pidiendo números y va
respondiendo si el número a adivinar es mayor o menor que el introducido, además
de los intentos que te quedan (tienes 10 intentos para acertarlo).
El programa termina cuando se acierta el número (además te dice en cuantos
intentos lo has acertado), si se llega al límite de intentos te muestra el número que
había generado.*/
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		double valor = rnd.nextFloat(1, 100);
		int n = (int)Math. round(valor);


		
		int contador=1;
		System.out.println("introduzca un numero: ");
		String in = sc.nextLine();
		int intento = Integer.parseInt(in);
		if (n == intento){
			System.out.println("Enhorabuena!");
		}else  {
		while (n != intento){
			if (intento >n){
				System.out.println("es menor que " + intento);
				in = sc.nextLine();
				intento = Integer.parseInt(in);
				contador ++;}
			if (intento <n){
				System.out.println("es mayor que " + intento);
				in = sc.nextLine();
				intento = Integer.parseInt(in);
				contador ++;;}
			if (n==intento){
				System.out.println("Enhorabuena!");
				break;
			}else if (contador == 10) {
				System.out.println("Ha superado el numero de intentos, el número es: " + n);
				break;
			}
	}
		}
	}
}
