package condicional1;

import java.util.Scanner;

public class main {

	static int unidades;
	static String mensaje;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el número de unidades a comprar: ");
		unidades = sc.nextInt();
		
		if(unidades < 5) {
			mensaje = "El pago debe hacerse en efectivo."; 
		}else{
			mensaje = "El pago debe hacerse con tarjeta."; 	
		}
		
		System.out.println(mensaje);
	}
}