package ejerciciosAdicionales;

import java.util.Scanner;

public class ejerciciosAdicionales8 {

	public static void main(String[] args) {
		/* Escribe un programa que pida al usuario una fecha y valide si es correcta. Solicita
		por separado el día, el mes y el año. Piensa en las condiciones que debe cumplir
		una fecha para que sea correcta. Puedes reutilizar el código para saber si un año es
		bisiesto*/
		Scanner sc = new Scanner(System.in); 
		System.out.println("Dime el día de una fecha"); 

        int dia = sc.nextInt(); 

         

        System.out.println("Dime el mes de una fecha"); 

        int mes = sc.nextInt(); 

         

        System.out.println("Dime el año de una fecha"); 

        int anyo = sc.nextInt(); 

         

		switch (mes) { 

		case 1: { 

			if (dia <= 31 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		 

		case 2: { 

			if (dia <= 28 && dia>=1 || dia <= 29 && anyo%4==0) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}if (anyo%4==0) { 

				System.out.println("El año es bisiesto"); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		 

		case 3: { 

			if (dia <= 31 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 4: { 

			if (dia <= 30 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 5: { 

			if (dia <= 31 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 6: { 

			if (dia <= 30 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 7: { 

			if (dia <= 31 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 8: { 

			if (dia <= 31 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 9: { 

			if (dia <= 30 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 10: { 

			if (dia <= 31 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 11: { 

			if (dia <= 30 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		case 12: { 

			if (dia <= 31 && dia>=1) { 

				System.out.println(dia + "/" + mes + "/" + anyo); 

			}else { 

				System.out.println("La fecha no es válida"); 

			} 

			break; 

		} 

		 

		default: 
			System.out.println("La fecha no es válida");
			

		} 
		sc.close();
		
	}

}
