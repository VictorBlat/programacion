package holaMundo;

import java.util.Scanner;

public class ejercicioBasico7 {

	public static void main(String[] args) {
// 7. Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo. Se debe comprobar que el divisor no puede ser cero.
		Scanner sc = new Scanner(System.in);
        System.out.println("introduce una numero: ");
        
        String n1NextLine = sc.nextLine();
        int n1 = Integer.parseInt(n1NextLine);
        
        
        System.out.println("introduce una numero: ");
        
        String n2NextLine = sc.nextLine();
        int n2 = Integer.parseInt(n2NextLine);
        
        if (n2 == 0) {
        	System.out.println("No se puede realizar la operación");
        }else {
        	System.out.println((n1 / n2)+ ": este es el resultado de la división" );
        }
		sc.close();
	}

}
