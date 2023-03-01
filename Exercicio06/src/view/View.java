package view;
import javax.swing.JOptionPane;

import controller.Controller;
public class View {

	public static void main(String[] args) {
		Controller c = new Controller();
		int valor;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Insira"));
		}while(valor<=0 || valor >10);
		
		System.out.println(c.somaSequenciaFatorial(valor));
	}

}
