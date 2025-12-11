package tema5.resumen;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] cubo=new int[5];
		cubo[0]=0;
		cubo[1]=5;
		cubo[2]=10;
		cubo[3]=15;
		cubo[4]=20;
		
		for(int i=0;i<cubo.length;i++) {
			cubo[i]+=5;
			
			System.out.println(cubo[i]);
			
		}

	}

}
