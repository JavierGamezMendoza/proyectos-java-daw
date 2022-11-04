/* Realiza un programa que resuelva una ecuación de primer grado (del tipo: ax+b = 0). */

package condicional5;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********************************");
		System.out.println("*******PROGRAMA ECUACIONES********");
		System.out.println("**********************************");
		
		System.out.println("Este programa resuelve ecuaciones del tip ax + b = 0");
		System.out.print("Introduzca el valor de a: ");
		a = sc.nextInt();
		System.out.print("Introduzca el valor de b: ");
		b = sc.nextInt();
		
		x = b / -a;
		
		System.out.println("X es igual a " + x );
	}

}