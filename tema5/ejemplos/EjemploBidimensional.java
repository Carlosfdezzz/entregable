package tema5.ejemplos;

public class EjemploBidimensional {

	public static void main(String[] args) {
		// temperaturas[dia][tipo]
		// Día: 0-lunes, 1-martes...
		// tipo:0-máxima, 1-minima
		double[][] temperaturas = new double[7][2];

		// La máxima del miercoles fue 18 grados
		temperaturas[2][0] = 18.0;

		// Mínims del sabado
		temperaturas[5][1] = 4.0;

		for (int tipo = 0; tipo < temperaturas[0].length; tipo++) {
			// FILA=0
			for (int dia = 0; dia < temperaturas.length; dia++) {
				System.out.printf("%5.2f ", temperaturas[dia][tipo]);
			}
			System.out.println();
		}
	}

}
