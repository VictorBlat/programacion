package holaMundo;

public class ejercicioArgumentos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero1 = args[0];
		String numero2 = args[1];
		String simbolo = args[2];
		Integer n1=Integer.parseInt(numero1);
		Integer n2=Integer.parseInt(numero2);
		switch (simbolo) {
		case "resta": {
			System.out.println("el "+n1 + " - " + n2 + " = "+(n1-n2));
			break;
		}
		case "suma": {
			System.out.println("el "+n1 + " + " + n2 + " = "+(n1+n2));
			break;
		}
		case "multiplicacion": {
			System.out.println("el "+n1 + " * " + n2 + " = "+(n1*n2));
			break;
		}
		case "division": {
			System.out.println("el "+n1 + " / " + n2 + " = "+(n1/n2));
			break;
		}
		default:
			System.out.println("no has elegido bien la operación o no has rellenado todos los argumentos");
			break;
		}
	}

}
