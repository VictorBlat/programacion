package ejerciciosAdicionales;

public class ejerciciosAdicionales9 {

	public static void main(String[] args) {
		/* 9. Escribir un programa para imprimir los números enteros positivos entre 1 y “n”, en
orden sucesivo por filas, según lo siguiente:
i. En la primera fila va solamente el 1
ii. A partir de la segunda fila se escribe un número más que en el renglón
anterior.
Por ejemplo: ¿Cuántos números se van a imprimir? 18
Respuesta del programa:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18*/
		Scanner sc = new Scanner(System.in); 

		System.out.println("Por favort dime un número"); 

		System.out.println(""); 

		 

		  

 

		for (int i = 1; i <= n; i++) {  

		for (int j = 1; j <= n - i; j++) {  

 

		System.out.print("");  

		}  

 

		for (int j = 1 ; j <= i; j++) {  

		System.out.print(j);  

		}  

 

		System.out.println();  

		} 

	}

}
