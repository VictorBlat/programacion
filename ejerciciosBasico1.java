package holaMundo;

import java.util.Scanner;

public class ejerciciosBasico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Programa Java que lea un número entero y calcule si es par o impar.
		
		Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número: ");
        
        String n1NextLine = sc.nextLine();
        int n1 = Integer.parseInt(n1NextLine);
        int par = (n1%2);
        if(par == 0){
        	System.out.println(n1 +" este numero es par");
        }else {
        	System.out.println(n1 +" este numero es impar");
        }
        
       sc.close();
	}

}
