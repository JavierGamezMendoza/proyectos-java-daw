/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que 
 * se imparten en el curso. Cada pregunta acertada sumará un punto. 
 * El programa mostrará al final la calificación obtenida. Pásale el minicuestionario 
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en 
 * las diferentes asignaturas del curso.
 */


package condicional11;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("Cuestionario en Java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Responde las siguientes 10 preguntas:");
		
		System.out.println("P1 - Cuál es el nombre de la entidad utilizada en programación para guardar diferentes valores.");
		System.out.println("1 - Funciones");
		System.out.println("2 - Objetos");
		System.out.println("3 - Variables");
	}
}
