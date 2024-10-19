package holaMundo;

import java.util.Scanner;

public class ejerciciosBasico3 {

	public static void main(String[] args) {
		//3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
		Scanner sc = new Scanner(System.in);
        System.out.println("introduce una letra: ");
        
        String n1NextLine = sc.nextLine();
        char letra = n1NextLine.charAt(0);
        int n1 = letra;
        if(n1 >=65 && n1 <=90){
        	System.out.println(n1NextLine +" esta letra es mayuscula");
        }else { 
        
        if (n1 >=97 && n1 <=122) {
        	System.out.println(n1NextLine +" esta letra es minuscula");
        }
        	
        else {System.out.println(n1NextLine +" esto no es una letra");
        	
        }
        	
   	   
        }
   	   
       sc.close();
	}

}
