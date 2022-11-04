/*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente 
nombre del día de la semana.*/
package condicional3;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaSemana;
		String dia;
		
		System.out.print("Introduzca un día de la semana: ");
		diaSemana = Integer.parseInt(sc.nextLine());
		System.out.println(diaSemana);
		switch(diaSemana) {
			case 1: dia = "Lunes"; break;
			case 2: dia = "Martes"; break;
			case 3: dia = "Miércoles"; break;
			case 4: dia = "Jueves"; break;
			case 5: dia = "Viernes"; break;
			case 6: dia = "Sábado"; break;
			case 7: dia = "Domingo"; break;
			default: dia = "no válido"; break;
	
		}
		System.out.println("Ha seleccionado el día " + dia);
	}

}
