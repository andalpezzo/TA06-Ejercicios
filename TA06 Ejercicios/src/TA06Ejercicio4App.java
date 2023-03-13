import javax.swing.JOptionPane;

public class TA06Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		String TextoNumero;
		int Numero;
		
		//Mostramos una ventana para introducir el numero que queramos comprobar
 		TextoNumero = JOptionPane.showInputDialog("Escribe un numero para saber su factorial");
 		Numero = Integer.parseInt(TextoNumero);
 		 
		//Mostramos el resultado en una ventana
		JOptionPane.showMessageDialog(null, "El factorial de " + Numero + " es " + calcularFactorial(Numero));
	}
	
	public static int calcularFactorial(int Numero) {
		int Factorial = Numero;
		
        while(Numero>1) {
        	Numero--;
        	Factorial = Factorial*Numero;
        }
		
		return Factorial;
	}
}