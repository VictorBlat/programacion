package ejerciciosAdicionales;

public class ejerciciosAdicionales12 {

	public static void main(String[] args) {
		/*12. Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10€,
el segundo 20 €, el tercero 40 € y así sucesivamente.
Realizar un programa para determinar cuánto debe pagar mensualmente y el total
de lo que pagará después de los 20 meses*/
		
		int meses = 2;
		int i = 10;
		int a = i *2;
	
		System.out.println(i);
		System.out.println(a);
		do {
		a=a+20;
			System.out.println(a);
			meses ++;
		} while (meses <= 20);
		
	
	}

}
