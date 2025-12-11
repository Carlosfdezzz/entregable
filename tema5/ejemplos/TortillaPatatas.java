package tema5.ejemplos;

public class TortillaPatatas {

	public static void main(String[] args) {
		// Declaracion de la variable
		String[] ingredientesTortilla;
		double[] listaCantidades;
		// Creacion del array vacío
		ingredientesTortilla = new String[5];
		listaCantidades = new double[5];
		// Inicializando los valores del array
		ingredientesTortilla[0] = "Patata";
		ingredientesTortilla[1] = "Huevo";
		ingredientesTortilla[2] = "Sal";
		ingredientesTortilla[3] = "Aceite";
		ingredientesTortilla[4] = "Cebolla";
		// VALORES CANTIDAD
		listaCantidades[0] = 500;
		listaCantidades[1] = 100;
		listaCantidades[2] = 125;
		listaCantidades[3] = 150;
		listaCantidades[4] = 7;
		System.out.println("INGREDIENTES TORTILLA PATATAS:");

		// FOR AVANZADO
//		for (String ingrediente : ingredientesTortilla) {
//			System.out.println(ingrediente);
//		}

		for (int i = 0; i < 5; i++) {
			System.out.printf("Ingrediente %d: %s\n", i, ingredientesTortilla[i]);
		}
		System.out.println();
		System.out.println("RECETA");
		// imprimir la receta
		for (int i = 0; i < ingredientesTortilla.length; i++) {
			System.out.printf("-%.2f gramos de %s\n", listaCantidades[i], ingredientesTortilla[i]);
		}
	}

}
