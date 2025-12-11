package tema5.resumen;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		String[] apellidos=new String[2];
		String nombreCompleto;
		
		for(int i=0; i<apellidos.length; i++) {
			apellidos[i]=JOptionPane.showInputDialog("Introduce tus apellidos: "+(i +1) );
		}
		
		nombreCompleto="";
		for(int i=0; i<apellidos.length;i++) {
			nombreCompleto+=apellidos[i]+" ";
		}
		JOptionPane.showMessageDialog(null,"Hola sr "+ nombreCompleto);

	}

}
