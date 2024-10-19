package ejerciciosPropuestos;

import java.util.Random;

public class ejerciciosPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Import java.util.*;
		public class Test {
				public static void main ( String [ ] args) {*/
		Random rnd = new Random();
		double valor = rnd.nextFloat(100, 200);
		int n = (int)Math. round(valor);
		System.out.println(n);
		System.out.println("*********************************");
		int par = n%2;
		if (par == 0) {
			
			System.out.println(n + (" es un numero par"));
			
		}else {
			System.out.println(n + (" es un numero impar"));
		}
	}

}
