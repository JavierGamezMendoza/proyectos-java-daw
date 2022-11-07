package prueba1;
import java.util.Scanner;

public class apartado4 {

	public static void main(String[] args) {
		final int relacion = 1609;
		int gradosFahrenheit;
		int gradosCelsius;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una distancia (Millas). Esta será transformada a metros: ");
		gradosCelsius = sc.nextInt();
		gradosFahrenheit = 9 / 5 * gradosCelsius + 32;
		
		System.out.println("La temperatura introducida (fahrenheit) equivale a " + gradosFahrenheit + " Fº.");

	}

}
