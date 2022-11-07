package prueba1;
import java.util.Scanner;
public class apartado3 {

	public static void main(String[] args) {
		int distanciaMillas;
		int distanciaMetros;
		final int relacion = 1609;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una distancia (Millas). Esta será transformada a metros: ");
		distanciaMillas = sc.nextInt();
		distanciaMetros = distanciaMillas * relacion;
		
		System.out.println("La distancia introducida (Millas) es equivalente a " + distanciaMetros + " m.");
		
	}

}
