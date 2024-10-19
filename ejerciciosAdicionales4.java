package ejerciciosAdicionales;

import java.util.Scanner;

public class ejerciciosAdicionales4 {

	public static void main(String[] args) {
		/* Escribe un programa con un String que contenga una contraseña cualquiera.
		Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes
		ya no pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”.
		Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden
		intentos).*/
		Scanner sc = new Scanner(System.in);
		String contrasenya = "hola";
		int contador=1;
		System.out.println("introduzca la contraseña: ");
		String intento = sc.nextLine();
		if (contrasenya.equals(intento)){
			System.out.println("Enhorabuena!");
		}else  {
		while (!contrasenya.equals(intento)){
			System.out.println("introduzca la contraseña correcta ");
			intento = sc.nextLine();
			contador ++;
			if (contrasenya.equals(intento)){
				System.out.println("Enhorabuena!");
				break;
			}else if (contador == 3) {
				System.out.println("Ha superado el numero de intentos");
				break;
			}
			
	}
	}
		sc.close();
	}
}
