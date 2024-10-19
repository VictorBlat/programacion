package holaMundo;

public class HolaMundo {

	public static void main(String[] args) {
		
		
		
		
		
		

		//este bucle se usa para cuando yo sepa el numero de veces que va a ocurrir algo
		//el i ++ es para sumar un nuemro y el i -- es para restar 
		int limite=15;
		
		for (int i = 0; i < limite; i++) {
			
			System.out.println("Es la vez número: "+i);
		}
		//hacer que el programa que me dice que es bisiesto se ejecute hasta que encuentre uno bisiesto
		int v=1;
		int x=0;
		
		while (v < 10) {
			x= x+v;
			v ++;
		}
		System.out.println(x);
		/*
		int any = 2008;
		int resto = 0;
		resto = any%4;
		boolean esBisiesto=false;
		
		//El anyo es divisible entre 4?
		if (resto==0) {
			{
							
			//el anyo es divisible entre 100?
			resto = any%100;
			if (resto == 0) {
				resto=any%400;
				//el anyo NO es divisible entre 400?
				if (resto!=0) 
				{
					esBisiesto=false;
				}
				else {
					esBisiesto=true;
				}
			}else {
				
				esBisiesto=true;
			}
		}
		}
		if (esBisiesto==true) {
			System.out.println("Soy un anyo Bisisesto");
		} else {
			System.out.println("soy un anyo no Bisiesto");

		}

		//if=condición cntrl+espacio (si pones el principio del conmando) te sale todas las posibilidades con el 
		// el comando (/*) es para comentar todo lo siguiente hasta el (*/
		//== es preguntar si es igual y el = es para asignar
		//int en una variable es para decir que va a ser una vaiable entera
		//la variable es util para cuando el valor suele ser diferente
		//% --> para el modulo
		//!= --> distinto
		//! --> no
		// no poner en el codigo ni " ñ " ni " ´ "
		// una variable booleana es una variable que solo puede ser o una o otra (o si o no)
		//el +i es para concatenar texto (une el texto)
	/*	int variableEntera = 2020;
		
		//esta es la estructura del if
		if (variableEntera>8) {
			
			System.out.println("Se ha cumplido la condición");
			 
			if (2==1) {
				System.out.println("Uno es igual a dos");
			}
			else {
				System.out.println("Dos no es igual a uno");	
			}
		} 
		else {
			
			System.out.println("No se ha cumplido la condición");

		}
		
		System.out.println("No estoy dentro de ninguna condición por lo que siempre me voy a ejecutar.");
		
	}*/
		/*crea un programa que diga si un año es visiesto son visiestso si son divisibeles entre 4 pero no dibisibles entre 100 y no entre 400*/

		}	
}
