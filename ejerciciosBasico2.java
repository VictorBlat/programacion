package holaMundo;

import java.util.Scanner;

public class ejerciciosBasico2 {

	public static void main(String[] args) {
		// 2. Programa que lea un número entero y muestre si el número es múltiplo de 10.		
				Scanner sc = new Scanner(System.in);
		        System.out.println("introduce un número: ");
		        
		        String n1NextLine = sc.nextLine();
		        int n1 = Integer.parseInt(n1NextLine);
		        int par = (n1%10);
		        if(par == 0){
		        	System.out.println(n1 +" este numero es multiplo de 10");
		        }else {
		        	System.out.println(n1 +" este numero no es multiplo de 10");
		        }
		        
		       sc.close();
	}

}
