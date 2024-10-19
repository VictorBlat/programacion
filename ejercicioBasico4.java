package holaMundo;

import java.util.Scanner;

public class ejercicioBasico4 {

	public static void main(String[] args) {
		// 4. Programa que lea dos caracteres por teclado y compruebe si son igual
		Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce un caracter: ");
        
        String n1 = sc.nextLine();
        char letra1 = n1.charAt(0);
        int r1 = letra1;
        
        System.out.println("introduce un caracter: ");
        String n2 = sc.nextLine();
        char letra2 = n2.charAt(0);
        int r2 = letra2;
       
        if (r1 == r2) {
        	 System.out.println("igual");
			
		}else {
			 System.out.println("no igual");
		}
        

       sc.close();

	}

}
