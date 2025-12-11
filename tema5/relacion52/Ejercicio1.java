package tema5.relacion52;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Paso 1
		Scanner teclado = new Scanner(System.in);
		int numeroEntero;
		int numeroPedido;
		//Paso 2
		do {
			System.out.println("Introdice un número entero: ");
			numeroEntero = Integer.parseInt(teclado.nextLine());

		} while (numeroEntero < 1 || numeroEntero > 100);
		//Paso 3
		int[] array = new int[numeroEntero];
		//Paso 4
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
			System.out.println(array[i]);
		}
		//Pasos 5 y 6
		do {
			System.out.println("Introduce un número que entre en el array:");
			numeroPedido=Integer.parseInt(teclado.nextLine());
			
		}while(numeroPedido>numeroEntero||numeroPedido<0);
		
		//Paso 7
		
	}

}
