package tema5.resumen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean[] booleano = new boolean[4];

		System.out.println("Introduce los valores: ");
		booleano[0] = Boolean.parseBoolean(teclado.nextLine());
		booleano[1] = Boolean.parseBoolean(teclado.nextLine());
		booleano[2] = Boolean.parseBoolean(teclado.nextLine());
		booleano[3] = Boolean.parseBoolean(teclado.nextLine());

		for (int i = 0; i < booleano.length; i++) {
			System.out.printf("El usuario ha introducido: %s\n", booleano[i]);
		}
		teclado.close();
	}
}
