package tema5.ejemplos;

public class EjemploArrays {
	public static void main(String[] args) {
		// Declaracion de la variable
		String[] listaRegalos;
		// Creacion del array vacío
		listaRegalos = new String[5];
		// Inicializando los valores del array
		listaRegalos[0] = "PlayStation";
		listaRegalos[1] = "Ropa";
		listaRegalos[2] = "Portátil";
		listaRegalos[3] = "Mesa Gamer";
		listaRegalos[4] = "Móvil";

		for (int i = 0; i < 5; i++) {
			System.out.printf("El regalo %d es %s\n", i, listaRegalos[i]);
		}
	}
}
