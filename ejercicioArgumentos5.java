package holaMundo;

public class ejercicioArgumentos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*desarrolla un programa que, una vez ejecutado, lea información desed el teclado hasta que reciba la cadena de entrada "FIN"*/
		        
		        String arg1 = args [0];
		        Integer n = Integer.parseInt(arg1);
 
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		        }
		        
		            for (int j = 1 ; j <= 2 * i - 1; j++) {
		                System.out.print(n);
		        }
		            System.out.println();
		        }
		    }
}
