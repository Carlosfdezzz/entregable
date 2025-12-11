package tema5.ejemplos;

import java.util.Scanner;

public class NotaMaxMin {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double[] notas;
		notas = new double[10];
		double minimo, maximo;
		
		for(int i =0;i<notas.length;i++) {
			System.out.printf("Indique la nota %d: \n",i+1);
			notas[i]=Double.parseDouble(teclado.nextLine());
		}
		
		//Calcular mínimo y máximo
		minimo=Double.MAX_VALUE;
		maximo=Double.MIN_VALUE;
		
		for (double nota : notas) {
			if(nota<minimo) 
				minimo=nota;
			
			if(nota>maximo)
				maximo=nota;
			
		}
		System.out.printf("La nota más alta es: %.2f\n", maximo);
		System.out.printf("La nota más baja es: %.2f\n", minimo);
		
		
		
		teclado.close();

	}

}
