package tema5.resumen;

public class Ejercicio2 {

	public static void main(String[] args) {
		double[] numeroDouble=new double[10];
		
		for(int i=0;i<numeroDouble.length;i++) {
			numeroDouble[i]=(Math.random()*9+1);
			System.out.printf("Número %d: %.2f\n",i,numeroDouble[i]);
		}

	}

}
