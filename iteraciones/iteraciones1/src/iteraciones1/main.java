/*
 * Diseñar un programa que muestre, para cada número introducido por teclado, 
 * si es par, si es positivo, y su cuadrado. El proceso terminará cuando el 
 * número introducido por teclado sea 0.
 */


package iteraciones1;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int numero;
		String esPar;
		String esPositivo;
		double raiz;
		int resultadoModulo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido :)");
		System.out.println("Este software proporcionara información acerca del número que introduzcas.");
		
		
		while(true) {
		System.out.print("Introduce un número [0 para salir]: ");
		
		numero = sc.nextInt();
		
		if (numero == 0) {
			return;
		}
		
		raiz = Math.sqrt(numero);
		if(numero >= 0 ) {
			esPositivo="positivo";
		}else {
			esPositivo="positivo";
		}
		resultadoModulo = numero % 2;
		if(resultadoModulo == 0) {
			esPar = "par";
		}else {
			esPar = "impar";
		}
		
		System.out.println("El número introducido(" + numero + ") es " + esPar + ", " + esPositivo + ", y su raiz es " + raiz + ".");
		}
	}

}
