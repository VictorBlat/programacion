package holaMundo;

public class ejercicioArgumentos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String argumento1 = args[0];
		Integer argumentoanyo=Integer.parseInt(argumento1);
		
		int resto = 0;
		resto = argumentoanyo%4;
		boolean esBisiesto=false;
		
		if (resto==0) {
			{
			resto = argumentoanyo%100;
			if (resto == 0) {
				resto=argumentoanyo%400;
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
			System.out.println(" no soy un anyo Bisiesto");

		}
	}

}
