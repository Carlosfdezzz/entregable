package tema5.ejemplos;

public class EjemploArraySinInicializar {
	public static void main(String[] args) {
		String[] listaCadenas=new String[5];
		for (String cadena : listaCadenas) {
			System.out.println(cadena);
		}
		int[] listaNumeros=new int[5];
		for (int numero: listaNumeros) {
			System.out.println(numero);
		}
		boolean[] listaBooean=new boolean[5];
		for (boolean numero: listaBooean) {
			System.out.println(numero);
		}
		//Al no inicianizar los arrays sale null, 0, false...
	}
}
