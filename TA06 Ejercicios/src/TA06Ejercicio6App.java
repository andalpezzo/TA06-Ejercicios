
import javax.swing.JOptionPane;

public class TA06Ejercicio6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		String Numero;
		
		//Mostramos una ventana para introducir el numero del que queramos saber las cifras
 		Numero = JOptionPane.showInputDialog("Escribe un número para saber cuantas cifras tiene");
 		//Ya nos sirve el número en formato string a porque tan solo vamos a contar el número de caracteres que contiene 
 		 
		//Mostramos el resultado en una ventana
		JOptionPane.showMessageDialog(null, "El número " + Numero + " tiene " + contarCifras(Numero) + " cifras");
	}
	
	public static int contarCifras(String Numero) {
		int NumeroCifras = Numero.length();
		
		return NumeroCifras;
	}
}


