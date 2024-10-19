package ejerciciosPropuestosRecursividad;

public class ejPropuestosRecursividad1 {

	public static void main(String[] args) {
/*Realiza una clase con dos métodos que generen el factorial de un número pasado por parámetro, de la siguiente forma:
● método factorial_recursivo
● método factorial_iterativo
● método main que pruebe ambos métodos anteriores*/
		
		class Recursiva {
			int factorial (int n) {
				if (n>0) {
					int resultado = n * factorial (n-1);
					return resultado;
				}else {
					return 1;
				}
			}
		}
			Recursiva recursiva = new Recursiva();
			System.out.println("Factorial de " +6);
			System.out.println(recursiva.factorial(6));
		
		class Iterativa {
			int factorial (int n) {
				int resultado =1;
				for (int i = n; i >=1; i--) {
					resultado *=1 ;
				}
					return resultado;
				}
			}

			Iterativa iterativa = new Iterativa();
			System.out.println("Factorial de " +6);
			System.out.println(iterativa.factorial(6));
	}

}
