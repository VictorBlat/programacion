package ejerciciosAdicionales;

import java.util.Scanner;

public class ejerciciosAdicionales7 {

	public static void main(String[] args) {
			/*Escribe un programa que pida al usuario 2 operandos (int) y un signo aritmético
(String) y, según este último, se realizará la operación correspondiente. Al final
mostrará el resultado en un cuadro de diálogo.
Los signos aritméticos disponibles son:
i. +: suma los operandos.
ii. -: resta los operandos.
iii. *: multiplica los operandos.
iv. /: divide los operandos, resultado con decimales (double)
v. ^: 1er operando como base y 2º como exponente.
vi. %: módulo, resto de la división entre operando1 y operando2.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número:"); 

        int n1 = sc.nextInt(); 

         

        System.out.println("Escribe otro número:"); 

        int n2 = sc.nextInt(); 

         

        System.out.println("Introduce un símbolo aritmético (+, -, *, /, ^, %):"); 

        String operacion = sc.next();  

         

        switch (operacion) { 

            case "+": 

                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2)); 

                break; 

            case "-": 

                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2)); 

                break; 

            case "*": 

                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2)); 

                break; 

            case "/": 

                if (n2 != 0) { 

                    System.out.println(n1 + " / " + n2 + " = " + ((double)n1 / n2));  

                } else { 

                    System.out.println("Error: No se puede dividir por cero."); 

                } 

                break; 

            case "^": 

                System.out.println(n1 + " ^ " + n2 + " = " + Math.pow(n1, n2));

                break; 

            case "%": 

                System.out.println(n1 + " % " + n2 + " = " + (n1 % n2)); 

                break; 

            default: 

                System.out.println("No es un símbolo aritmético válido."); 

        } 
        sc.close();
		
	}
}