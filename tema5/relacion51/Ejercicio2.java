package tema5.relacion51;

public class Ejercicio2 {

	public static void main(String[] args) {
		byte[] aleatorio = new byte[10];

		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio[i] = (byte) (Math.random() * 256-128);
//			aleatorio[i] = (byte)i;
			System.out.println(aleatorio[i]);
		}

		System.out.println();
		System.out.println("Números ordenados:");
		for (int i = 0; i < aleatorio.length/2; i++) {
			System.out.println(aleatorio[i]);
			System.out.println(aleatorio[aleatorio.length - i -1]);
		}
	}

}
