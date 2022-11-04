/*Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos 
* estadísticos de los alumnos. Se introducirán las edades de los elumnos hasta que 
* una de ellas sea negativa. La aplicación mostrará la suma de las edades, la media, 
* de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.
*/
package iteraciones2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int edad;
		int suma = 0;
		int media;
		int alumnos = 0;
		int mayores = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al gestor de alumnos del centro.");
		while(true) {
			System.out.print("Introduce la edad del alumno a añadir [cifra negativa para salir]: ");
			edad = sc.nextInt();
			if(edad < 0) {
				break;
			}
			suma = suma + edad;
			if (edad >= 18) {
				mayores++;
			}
			alumnos++;
		}
		media = suma / alumnos;
		
		System.out.println("El número de alumnos introducidos es: " + alumnos);
		System.out.println("El número de alumnos mayores de edad entre ellos es: " + mayores);
		System.out.println("La suma de las edades da como resultado:" + suma);
		System.out.println("La media de edades es: " + media);
	}

}
