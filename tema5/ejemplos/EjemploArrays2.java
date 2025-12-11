package tema5.ejemplos;

public class EjemploArrays2 {
	public static void main(String[] args) {
		// Declaracion de la variable, reservar el array e 
		//inicializar sus valores en una sola operacion
		String[] listaRegalos= {"PlayStation","Ropa","Portátil","Mesa Gamer","Móvil"};
		
		for (int i = 0; i < listaRegalos.length; i++) {
			System.out.printf("El regalo %d es %s\n", i, listaRegalos[i]);
		}
	}
}
