package holaMundo;

import java.util.Scanner;

public class ejercicioBasico8 {

	public static void main(String[] args) {
		// 8. Calcular el mayor de tres números enteros en Java.
		Scanner sc = new Scanner(System.in);
        System.out.println("introduce una numero: ");
        
        String n1NextLine = sc.nextLine();
        int n1 = Integer.parseInt(n1NextLine);
        
        
        System.out.println("introduce una numero: ");
        
        String n2NextLine = sc.nextLine();
        int n2 = Integer.parseInt(n2NextLine);
        
        System.out.println("introduce un numero: ");
        
        String n3NextLine = sc.nextLine();
        int n3 = Integer.parseInt(n3NextLine);
        if (n1 < n2 && n1 < n3){
        	System.out.println("el numero 1 es el mayor");
        }else {
        if (n2 > n3 && n2 > n1){
        	System.out.println("el numero 1 es el mayor");
        }else {

        if (n3 < n2 && n1 < n2){
            	System.out.println("el numero 2 es el mayor");
            }	
        }
        }
		sc.close();
	}

}
