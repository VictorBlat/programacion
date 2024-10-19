package holaMundo;

//import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		/* 7. Programa Java que declare una variable C de tipo entero y asígnale un valor. A
continuación muestra un mensaje indicando si el valor de C es positivo o negativo,
si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor
que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : )
dentro del println para resolverlo.*/
	/*
		int c=15;
		
		if (c<0) {
			System.out.println("el valor: "+ c + " es negativo");
		} else {
			System.out.println("el valor: "+ c + " es positivo");
		}
		
		if (c%2==0) {
			System.out.println("el "+c+" es número par");
		} else {
			System.out.println("el "+c+" es número impar");
		}
		if (c%5==0) {
			System.out.println("el valor: "+ c + " es multiplo de 5");
		} else {
			System.out.println("el valor: "+ c + " no es multiplo de 5");
		}
		if (c%10==0) {
			System.out.println("el valor: "+ c + " es multiplo de 10");
		} else {
			System.out.println("el valor: "+ c + " no es multiplo de 10");
		}
		if (c<100) {
			System.out.println("el valor: "+ c + " es menor que 100");
		} else {
			System.out.println("el valor: "+ c + " es mayor que 100");
		}
		*/
		
		
		
		/*6. Programa Java que declare una variable B de tipo entero y asígnale un valor. A
continuación muestra un mensaje indicando si el valor de B es positivo o negativo.
Consideraremos el 0 como positivo. Utiliza el operador condicional (? : ) dentro del
println para resolverlo.*/
/*		
		int b=-2;
		
		if (b<0) {
			System.out.println("el valor: "+ b + " es negativo");
		} else {
			System.out.println("el valor: "+ b + " es positivo");
		}
	*/		
		
		
		
		
		
		/*4. Programa java que declare cuatro variables enteras A, B, C y D y asígnale un
		valor acada una. A continuación realiza las instrucciones necesarias para que: B
		tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de
		B.*/
	/*
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		System.out.println("el valor de B es: "+(b=c));
		System.out.println("el valor de C es: "+(c=a));
		System.out.println("el valor de A es: "+(a=d));
		System.out.println("el valor de D es: "+(d=b));
		*/
		
		
		
		
/*3. Programa Java que declare una variable entera N y asígnale un valor.
A continuación escribe las instrucciones que realicen lo siguiente: Incrementar N en
77, Decrementarla en 3, Duplicar su valor.*/
		/*
		int n=2;
		System.out.println("el valor inicial es: "+n);
		n = n + 77;
		System.out.println("el valor 77 veces más: "+n);
		n = n- 3;
		System.out.println("el valor 3 veces menos: "+n);
		n = n * 2;
		System.out.println("el valor final es: "+n);
		*/
		
		
		
		
		
		/*						//Explicación de Scanner//
		Scanner nombreScanner =new Scanner(System.in); //Se crea el lector
		System.out.println("Por favor, dame tu edad: "); // se pide un dato al usuario
		String edadNextLine = nombreScanner.nextLine();//se lee el nombre con el nextLine()
		//retorna un string con el dato
		int edad1=Integer.parseInt(edadNextLine);
		/*es un metodo estatico(independiente del valor concreto que este guardando(general para 
		 * toda la clase)) de la clase integer
		 * el parseINt necesita un string para que funcione y si algo va mal lanzara una excepción de datos(error)
		 * */ 
		/*
		System.out.println("por favor dime tu edad de nuevo: ");
		
		int edad2 = nombreScanner.nextInt(); //se guarda automaticamente con el nextInt()
		System.out.println("Gracias, la primera edad fue: "+ edad1 + " y la segunda: "+ edad2 +". ¿Verdad?");
		
		
		nombreScanner.close();
		*/
		
		
		
		/*2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int,
		dos variables N y M de tipo double y asigna a cada una un valor. A continuación
		realiza y muestra por pantalla una serie de operaciones entre ellas.*/
		/*
		int x=1;
		int y=2;
		double n=3;
		double m=4;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(n);
		System.out.println(m);
		
		
		System.out.println(x+y);
		System.out.println(n+m);
		System.out.println(n+y);
		System.out.println(n+x);
		*/
		
		
		
		
		
		
		/*1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
variable A de tipo double y una variable C de tipo char y asigna a cada una un
valor. A continuación muestra por pantalla: El valor de cada variable, la suma de N
+ A, la diferencia de A - N, el valor numérico correspondiente al carácter que
contiene la variable C.


		
		int n=2;
		double a=12;
		char c='º';
		
		System.out.println(n);
		System.out.println(a);
		System.out.println(c);
		
		System.out.println(a+n);
		System.out.println(a-n);
		
		System.out.println((byte)c);
		*/
		
		
		/*
		String a = "esto es una cadena de texto";
		System.out.println(a);
		
		boolean variablePrimitivaBool=true;
		Boolean variableEnvoltorioBoolean=true;
		
		
		if(variablePrimitivaBool==false);
		
		variableEnvoltorioBoolean.equals(false);
		/*
		 * la \ es un significado especial
		Integer envoltorioInt=7;
		System.out.println(Integer.MAX_VALUE);*/
		
		//envoltorioInt.
/*
	switch (9) {
case 1:
	System.out.println("Lunes");
	
	break;
case 2:
	System.out.println("Martes");
	
	break;
case 3:
	System.out.println("Mercoles");
	
	break;
case 4:
	System.out.println("Jueves");
	
	break;
case 5:
	System.out.println("Viernes");
	
	break;
	case 6:
		System.out.println("Sabado");
		
		break;
	case 7:
		System.out.println("Domingo");	
		break;
default:
	System.out.println("No funciona");
	
	break;
}
/*
		int n1=0;
		int n2=2;
		System.out.println("el primer numero vale " + n1);
		System.out.println("el primer numero vale " + n2);
		if (n1>n2) {
			System.out.println("el "+ n1 + " es mayor");
		} else if (n2>n1) {
			System.out.println("el "+ n2 + " es mayor");
		} else {
			System.out.println("Los numeros son iguales");
		} {

		}*/
	}
}
