/*2 Realiza un programa que pida una hora por teclado y que luego muestre 
 * "buenos días", "buenas tardes" o "buenas noches" según la hora. 
 *Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. 
 *Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
*/

package condicional2;
import java.util.Scanner;

public class main {	

	public static void main(String[] args) {
		int hora;
		String mensaje;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una hora [1-24]: ");
		hora = sc.nextInt();
		
		
		if (hora >= 6 && hora <=12) {
			mensaje = "Buenos días";
		}else if (hora >=13 && hora <= 20) {
			mensaje = "Buenas tardes";
		}else {
			mensaje = "Buenas noches";
		}
		System.out.println(mensaje);
	}

}
