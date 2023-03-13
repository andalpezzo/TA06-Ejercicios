
import javax.swing.JOptionPane;

public class TA06Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		String TextoNumero;
		double Numero;
		
		//Mostramos una ventana para introducir el numero que queramos convertir a binario
 		TextoNumero = JOptionPane.showInputDialog("Escribe un numero para convertir a binario");
 		Numero = Double.parseDouble(TextoNumero);
 		 
		//Mostramos el resultado en una ventana
		JOptionPane.showMessageDialog(null, "El factorial de " + Numero + " es " + convertirEnBinario(Numero));
	}
	
	public static String convertirEnBinario(double Numero) {
		String Binario = "";
		
        if (Numero > 0) {
            while (Numero > 0) {
                if (Numero % 2 == 0) {
                    Binario = "0" + Binario;
                } else {
                    Binario = "1" + Binario;
                }
                Numero = (int) Numero / 2;
            }
        } 
		return Binario;
	}
}


