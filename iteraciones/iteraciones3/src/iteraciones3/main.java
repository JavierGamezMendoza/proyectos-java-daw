package iteraciones3;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int numero;
		int numeroAleatorio = (int) (Math.random() * 100 + 1);;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivina el número secreto (1-100).");
		System.out.print("Introduce un número: ");
		
		numero = sc.nextInt();
		while(numero != numeroAleatorio) {
			if (numero < numeroAleatorio) {
				System.out.println("Demasiado pequeño.");
			}else {
				System.out.println("Demasiado grande");
			}
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();
		}
		System.out.println("Correcto! El número secreto es: " + numero);
	}

}
