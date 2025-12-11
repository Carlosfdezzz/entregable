package tema5.relacion51;

import java.time.chrono.MinguoChronology;

public class Ejercicio1 {

	public static void main(String[] args) {
		byte[] aleatorio = new byte[5];

		for (int i = 0; i < aleatorio.length; i++) {
			// Rango*(max-min + 1) + min
			aleatorio[i] = (byte) (Math.random() * (127 - (-128) + 1) - (-128));
			System.out.println(aleatorio[i]);
		}
		System.out.println();
		System.out.println("Orden inverso: ");
		for (int i = 4; i >= 0; i--) {
			System.out.println(aleatorio[i]);
		}

	}

}
