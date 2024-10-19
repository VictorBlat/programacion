package holaMundo;

public class ejerciciosPropuestosT4 {
	
	static int n1 = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Ejercicio: Modifica el siguiente programa para que compile y funcione:
		/*	class suma {
			static int n1 = 50;
			public static void main (String[] args) {
			int n2 = 30, suma = 0, n3;
			suma = n1 + n2;
			System.out.println("LA SUMA ES: " + suma);
			suma = suma + n3;
			System.out.println(suma);
			}
			}*/
		//Solución
			//borramos el main para no tener 2 diferentes
			/*int n2 = 30, suma = 0, n3 = 0;//le damos valor a n3
			suma = n1 + n2;
			System.out.println("LA SUMA ES: " + suma);//cambiamos las comillas
			suma = suma + n3;
			System.out.println(suma);
			*/
		/*2. Ejercicio: ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione:*/
			//barramos el main para no tener 2 diferentes
			/*	int n1 = 50, n2 = 30;//punto y coma
				int suma = 0;//cambio de tipo de variable
				suma = n1 + n2;
				System.out.println("LA SUMA ES: " + suma);//cambio comillas
		*/
		
		/*3. Ejercicio: El siguiente programa tiene 3 fallos, averigua cuáles son y modifica el programa para
que funcione.*/
		/*int numero = 2,//poner bien la palablra numero
				cuad = numero * numero;//quitar el acento de número
		System.out.println("EL CUADRADO DE " +numero+" ES: " +cuad);//cambiar las comillas*/
		
		/*
		 4. Ejercicio: ¿Qué mostrará el siguiente código por pantalla? */
	/*int num = 5; //cambiamos la variable
		num = num - 1 * 4 + 1;//quitamos el simbolo + y cambiamos el - 
		System.out.println(num);
		num = 4;//cambiamos la mayuscula
		num = 7 * num % 3 * 7 >> 1;//quitamos el primer %
		System.out.println(num);	
	*/
		/*5. Ejercicio: Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros
(busca la fórmula en Internet).*/
		/*int r=3;
		double res = 2 * Math.PI * r;
		System.out.println(res);
	*/
		
		/*6. Ejercicio: Realiza un programa que calcule el área de una circunferencia de radio 5,2 cm.*/
		/*double r= 5.2;
		double res = Math.PI * Math.pow(r, 2);
		System.out.println(res);*/
		
		/*7. Ejercicio: Realiza un programa que muestre en pantalla, respetando los retornos de línea, el siguiente texto:
		Me gusta la programación
		Cada día más.*/
	
		//System.out.println("Me gusta la programación \nCada dia más");
		
		/*Ejercicio 8: (ejercicio de dificultad alta) Realiza un programa que genere letras aleatoriamente y determine si son vocales o consonantes.*/
		
		/*int num = (int) Math.random()*26;
		char letra = (char) ('r'+ num);
		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(letra + ": es vocal");
		break;
		default:
			System.out.println(letra + ": es consonante");
			break;
		}
		*/
		/*9. Ejercicio: Dentro de una clase joven tenemos las variables edad, nivel_de_estudios e ingresos. Necesitamos almacenar en la variable booleana jasp el valor:
			Verdadero: Si la edad es menor o igual a 28 y el nivel_de_estudios es mayor de tres, o bien, la edad es menor de 30 y los ingresos superan los
			28.000 euros.
			Falso: en caso contrario.
			Escribe el código necesario (2 líneas)*/
		/*int edad = 29, nves = 12, nin = 10; boolean jasp = false; 
		if(edad <= 28 && nves > 3 || edad <30 && nin > 28000) { jasp=true;System.out.println("Es verdadero");
		}else {
		System.out.println("Es falso");}
		*/
		
/*Ejercicio: Realiza un programa con una variable entera t la cual contiene un tiempo en
segundos y queremos conocer este tiempo pero expresado en horas, minutos y segundos. */
		/*
		int t =7267;
		System.out.println("el timpo en segundos es: " + t);
		int h = t /3600;
		int m = (t - (h *3600))/60;
		int s = t - (h*3600) - (m *60);
		
		System.out.println(" el timpo en horas:min:segs: " + h +"h:" + m  + "min:" + s +"seg");
		*/
		/*Ejercicio: (ejercicio de dificultad alta) Realiza un programa que dado un importe en euros
nos indique el mínimo número de billetes y monedas de curso legal que se pueden utilizar para
obtener dicha cantidad.
Por ejemplo 232 euros:
1 billete de 200
1 billete de 20
1 billete de 10
1 moneda de 2.
.*/

		int din = 2348;
		int quin = din/500;
		int dosc = (din - (quin * 500))/200;
		int cien = (din - (quin * 500) - (dosc * 200))/100;
		int cinc = (din - (quin * 500) - (dosc * 200) - (cien * 100))/50;
		int veint = (din - (quin * 500) - (dosc * 200)-(cien * 100)-(cinc * 50))/20;
		int diez = (din - (quin * 500) - (dosc * 200)-(cien * 100)-(cinc * 50)-(veint *20))/10;
		int cinco = (din - (quin * 500) - (dosc * 200)-(cien * 100)-(cinc * 50)-(diez * 10))/5;
		int dos = (din - (quin * 500) - (dosc * 200)-(cien * 100)-(cinc * 50)-(diez * 10) - (cinco * 5))/2;
		int uno = (din - (quin * 500) - (dosc * 200)-(cien * 100)-(cinc * 50)-(diez * 10) - (cinco * 5) - (dos * 2))/1;
		System.out.println(din + "€ este es el dinero que tienes y pagas :");
		if (quin >0) {
			System.out.println( quin + " billete/s de 500€ ");
		}if (dosc >0) {
			System.out.println( dosc + " billete/s de 200€ ");
		}if (cien >0) {
			System.out.println( cien + " billete/s de 100€ ");
		}if (cinc >0) {
			System.out.println( cinc + " billete/s de 50€ ");
		}if (veint >0) {
			System.out.println( veint + " billete/s de 20€ ");
		}if (diez >0) {
			System.out.println( diez + " billete/s de 10€ ");
		}if (cinco >0) {
			System.out.println( cinco + " billete/s de 5€ ");
		}if (dos >0) {
			System.out.println( dos + " moneda/s de 2€ ");
		}if (uno >0) {
			System.out.println( uno + " moneda/s de 1€ ");
		}
		
	}
}
