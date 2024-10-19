package holaMundo;

import java.util.Scanner;

public class ejerciciosScanner {

	public static void main(String[] args) {
		Scanner ns =new Scanner(System.in);
		
		/*13. Programa que calcula el número de la suerte de una persona a partir de su
fecha de nacimiento*/
		System.out.println("Dime tu año de nacimento de modo (xxxx)");
       
		
		String n1NextLine = ns.nextLine();
		int anyo=Integer.parseInt(n1NextLine);

		System.out.println("Dime tu mes de nacimento de modo (xx)");
       
		
		String n2NextLine = ns.nextLine();
		int mes=Integer.parseInt(n2NextLine);
		
		System.out.println("Dime tu dia de nacimento de modo (xx)");
       
		String n3NextLine = ns.nextLine();
		int dia=Integer.parseInt(n3NextLine);
		
		int suma = anyo + mes + dia;
		
		if (suma >= 1000 && suma <=9999) {
			int n1 = suma / 1000;
			int n2 = (suma/100) %10;
			int n3 = (suma/10) %10;
			int n4 = suma % 10;
			int nf = n1+n2+n3+n4;
			if (nf >=10) {
				int nf1 = nf /10;
				int nf2 = nf %10;
				int nff = nf1+nf2;
				
				System.out.println("tu numero de la suerte es: " + nff);
				
			}else {
			System.out.println("tu numero de la suerte es: " + nf);
			}
			}
		
		
		
		
		
		
		
		
		/*12. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el
final igual que en el ejemplo*/
		 /*
		System.out.println("Dime un numero de 5 cifras: ");
       
		
		String n1NextLine = ns.nextLine();
		int nCom=Integer.parseInt(n1NextLine);
		int n1 = nCom /10000;
		int r1 = n1*10000;
		int g1 = nCom - r1;
		int n2 = g1 / 1000;
		int r2 = n2 * 1000;
		int n3 = (g1 - r2)/100;
		int r3 = n3 * 100;
		int g2 = nCom - (r1 + r2 + r3);
		int n4 = g2/10;
		int r4 = n4 * 10;
		int n5 = nCom - (r1 + r2 + r3 + r4);
		
		
		System.out.println(n5);
		System.out.println(n4);
		System.out.println(n3);
		System.out.println(n2);
		System.out.println(n1);
		
		*/
		
		/*11. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el
		principio como en el ejemplo.*/
		/*
		System.out.println("Dime un numero de 5 cifras: ");
       
		
		String n1NextLine = ns.nextLine();
		int nCom=Integer.parseInt(n1NextLine);
		int n1 = nCom /10000;
		int r1 = n1*10000;
		int g1 = nCom - r1;
		int n2 = g1 / 1000;
		int r2 = n2 * 1000;
		int n3 = (g1 - r2)/100;
		int r3 = n3 * 100;
		int g2 = nCom - (r1 + r2 + r3);
		int n4 = g2/10;
		int r4 = n4 * 10;
		int n5 = nCom - (r1 + r2 + r3 + r4);
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		*/
		/*10. Programa que lee un número de 3 cifras y muestra sus cifras por separado.*/
		/*
		System.out.println("Dime un numero de 3 cifras: ");
       
		
		String n1NextLine = ns.nextLine();
		int nCom=Integer.parseInt(n1NextLine);
		int n1 = nCom /100;
		int r1 = n1*100;
		int g1 = nCom - r1;
		int n2 = g1 / 10;
		int r2 = n2 * 10;
		int n3 = g1 - r2;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		*/
		
		/*9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.*/
		/*
		System.out.println("Dime la longitud de la base del triangulo: ");
       
		
		String n1NextLine = ns.nextLine();
        double n1=Double.parseDouble(n1NextLine);
        System.out.println("Dime la longitud de la altura del triangulo: ");
       
		
		String n2NextLine = ns.nextLine();
        double n2=Double.parseDouble(n2NextLine);
        double r1 = ((n1*n2)/2);
        System.out.println("el el area del triangulo es:" + r1);
		
		*/
		
		
		//Math. --> es una libreria para hacer operaciónes matematicas.
		
		/*8. Programa que calcula el volumen de una esfera.*/
		/*
		System.out.println("Dime el radio de una esfera y te dire su volumen: ");
       
		
		double n1 = ns.nextDouble();
        double r1 = (4.0/3.0) * Math.PI * Math.pow(n1, 3);
       
        
        System.out.println("el volumen es:" + r1);
		*/
		
		
		
		
		
	  /*7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la
longitud de la hipotenusa según el teorema de Pitágoras.*/
		/*
		System.out.println("cateto1 ");
       
		
		String n1NextLine = ns.nextLine();
        double n1=Double.parseDouble(n1NextLine);
       
        
        System.out.println("cateto2");
		
        String n2NextLine = ns.nextLine();
        double n2=Double.parseDouble(n2NextLine);
		double n3=(n1*n1) + (n2*n2);
		
		 System.out.println("hipotenusa= "+(Math.sqrt(n3));
		*/
		
		
		
/*6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
teclado.*/
		/*
		System.out.println("Dime un numero, el ");
        String n1NextLine = ns.nextLine();
        double n1=Double.parseDouble(n1NextLine);
        System.out.println(n1*5/18);
		*/
		
		
		
		/*5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y
muestra por pantalla la longitud y el área de la circunferencia. Longitud de la
circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2*/
		/*System.out.println("Dime un numero, el ");
        String n1NextLine = ns.nextLine();
        double n1=Double.parseDouble(n1NextLine);
        System.out.println(2 * 3.14 * n1);
        System.out.println(3.14 * n1*n1);
        */
		/* 
        System.out.println("introduce la temperatura en ºC: ");
        
        String n1NextLine = ns.nextLine();
        double n1=Double.parseDouble(n1NextLine);
        
        
        System.out.println(32 + (9*n1/5));
		
		*/
		
		/* 3. Programa Java que lee un número entero por teclado y obtiene y
muestra por pantalla el doble y el triple de ese número.*/
	/*	
		System.out.println("Por favor, dame un numero: ");
		
		int n1 = ns.nextInt();
		System.out.println("el doble es " +n1*2);
		System.out.println("el triple es " +n1*3);
		*/
		
		
		
		
		/*2. Programa Java que lea un nombre y muestre por pantalla: “Buenos
días “nombre_introducido”. */
		/*
		System.out.println("Por favor, dame tu nombre: ");
	String nombreNextLine = ns.nextLine();
				
				System.out.println("Buenos dias "+ nombreNextLine + "!!");
				
				ns.close();*/
		
	/*1. Programa Java que lea dos números enteros por teclado y los
muestre por pantalla*/
		/*		
		System.out.println("Por favor, dame un numero entero: ");
String nNextLine = ns.nextLine();
		int n1=Integer.parseInt(nNextLine);
		
		System.out.println("por favor dime otro numero: ");
		int n2 = ns.nextInt(); 
		
		System.out.println("Gracias, el primer numero es: "+ n1 + " y el segundo: "+ n2 +". ¿Verdad?");
		
ns.close();
*/
		ns.close();
	}

}
