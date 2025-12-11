package tema5.ejemplos;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double[] notas=new double[5];
		double suma=0;
		double media=0;
		
		System.out.println("Introduce 5 notas de un alumno:");
		for(int i=0;i<notas.length;i++) {
			notas[i]=Double.parseDouble(teclado.nextLine());
		}
		System.out.println("Notas:");
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
		}
		for(int i=0;i<notas.length;i++) {
			suma+=notas[i];
			media=suma/notas.length;
		}
		System.out.println("La nota media del alumnos es: "+media);
		

	}

}
