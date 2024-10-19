package holaMundo;

import java.util.Scanner;

public class ejercicioBasico5 {

	public static void main(String[] args) {
		// 5. Programa que lea dos caracteres y compruebe si son dos letras minúsculas
		Scanner sc = new Scanner(System.in);
        System.out.println("introduce una letra: ");
        
        String n1NextLine = sc.nextLine();
        char letra = n1NextLine.charAt(0);
        int n1 = letra;
        
        System.out.println("introduce una letra: ");
        
        String n2NextLine = sc.nextLine();
        char letra2 = n2NextLine.charAt(0);
        int n2 = letra2;
        
        if((n1 >=65 && n1 <=90) && (n2 >= 65 && n2 <= 90) ){
        	System.out.println(n1NextLine + " o " + n2NextLine +" son letras mayusculas");
        }else { 
        
        if ((n1 >=97 && n1 <=122) && (n2 >=97 && n2 <=122)) {
        	System.out.println(n1NextLine + " y " + n2NextLine +" son letras minusculas");
        }
        	
        else {System.out.println(n1NextLine + " o " + n2NextLine +" esto no son una letra");
        	
        }
        	
   	   
        }
   	   
       sc.close();
	}

}
