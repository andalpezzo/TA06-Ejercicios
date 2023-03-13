import javax.swing.JOptionPane;

public class TA06Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		String TextoNumero;
		int Numero;
		String EsPrimo;
		
		//Mostramos una ventana para introducir el numero que queramos comprobar
 		TextoNumero = JOptionPane.showInputDialog("Escribe un numero para saber si es primo");
 		Numero = Integer.parseInt(TextoNumero);
		
		//If para ver que resultado que hay que mostrar según lo que retorne la función 
 		if (esPrimo(Numero) == true) {
 			EsPrimo = " es primo";
 		} else {
 			EsPrimo = " no es primo";
 		}
 		 
		//Mostramos el resultado en una ventana
		JOptionPane.showMessageDialog(null, "El número " + Numero + EsPrimo);
	}
	
	public static boolean esPrimo(int Numero) {
		int i = 2;
		boolean EsPrimo = true;
		int cont = 0;
		
        for (i = 1; i <= Numero; i++) {
            if (Numero % i == 0) {
                cont++;
            }
        }
        
        if (cont == 2) {
        	EsPrimo = true;
        } else {
            EsPrimo = false;
        }
		
		return EsPrimo;
	}
}

