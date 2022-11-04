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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido :)");
		System.out.println("Este software proporcionara información acerca del número que introduzcas.");
		
		System.out.print("Introduce un número [0 para salir]: ");
		numero = sc.nextInt();
		
		while(numero != 0) {

			raiz = numero * numero;
			esPositivo = (numero >= 0) ? "positivo" : "negativo";
			esPar = (numero % 2 == 0 ) ? "par" : "impar";
		
			System.out.println("El número introducido(" + numero + ") es " + esPar + ", " + esPositivo + ", y su raiz es " + raiz + ".");
			System.out.print("Introduce un número [0 para salir]: ");
			numero = sc.nextInt();
		}
	}

}
