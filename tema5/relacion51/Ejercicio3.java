package tema5.relacion51;

public class Ejercicio3 {
	public static void main(String[] args) {
		byte[] tabla1 = new byte[10];
		byte[] tabla2 = new byte[10];
		byte[] tabla3 = new byte[20];

		//Inicializar las dos tablas con números
		//10,11,12...
		//20,21,22...
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = (byte) (10 + i);
			tabla2[i] = (byte) (20 + i);
		}
		//Copiar las dos tablas origen a la tercera tabla de destino
		int destino=0;
		for (int i = 0; i < tabla1.length; i++) {
//			System.out.println(tabla1[i]);
//			System.out.println(tabla2[i]);
			
			tabla3[destino]=tabla1[i];
			tabla3[destino+1]=tabla2[i];
			destino+=2;
		}
		//Mostrar el resultado
		for (byte b : tabla3) {
			System.out.print(b+" ");
		}
		
	}
}
