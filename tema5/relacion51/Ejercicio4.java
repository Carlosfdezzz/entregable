package tema5.relacion51;

public class Ejercicio4 {

	public static void main(String[] args) {
		int menores, mayores;
		int a, b;
		byte[] listaNúmeros = { 1, 2, 3, 4, 5 };
//		byte[] listaNúmeros = { 1, 2, 3, 4, 5 };
//		byte[] listaNúmeros = { 5, 4, 3, 2, 1 };
//		byte[] listaNúmeros = { 5, 2, 4, 3, 1 };
//		byte[] listaNúmeros = { 5, 4, 4, 3, 1 };

		menores = mayores = 0;
		for (int i = 0; i < listaNúmeros.length - 1; i++) {
			a = listaNúmeros[i];
			b = listaNúmeros[i + 1];

			if (a < b) {
				menores++;
			} else if (a > b) {
				mayores++;
			}
		}
		// Imprimir la secuencia
		for (byte c : listaNúmeros) {
			System.out.print(c + " ");
		}
		System.out.println();
		// Decir sobre el orden
		if (menores == 0 && mayores == 0) {
			System.out.println("Son todos iguales");
		} else if (menores == 0) {
			System.out.println("Descendente");
		} else if (mayores == 0) {
			System.out.println("Ascendente");
		} else {
			System.out.println("Desordenado");
		}

	}

}
