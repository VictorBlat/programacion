package holaMundo;

import java.util.Scanner;

public class ejercicioBasico6 {

	public static void main(String[] args) {
		// Programa que lea un carácter y compruebe si es un número (Carácter entre '0' y '9').
		Scanner sc = new Scanner(System.in);
        System.out.println("introduce una letra: ");
        
        String n1NextLine = sc.nextLine();
        char letra = n1NextLine.charAt(0);
        int n1 = letra;
        
		if(n1 >=48 && n1 <=57){
        	System.out.println(n1NextLine +" Es un número");
        }else { 
        	System.out.println(n1NextLine +" No es un número");
	}
		sc.close();
	}
}
