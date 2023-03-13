
import javax.swing.JOptionPane;

public class TA06Ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String TextoTamañoArray;
		int TamañoArray;
		
		//Mostramos una ventana para introducir la cantidad de numeror aleatroios que queremos generar
		TextoTamañoArray = JOptionPane.showInputDialog("Indica el tamaño del array");
		TamañoArray = Integer.parseInt(TextoTamañoArray);
 		
		int ArrayNums[] = new int[TamañoArray];
 		
		//Llenamos el array y lo mostramos
 		llenarArray(ArrayNums);
		mostrarArray(ArrayNums);
	
		//Llamamos a la función de buscar los núemros terminados en el número indicado
 		seleccionarNumsTerminadosEn(ArrayNums);
	}
	
	//Función que llena el array con valores aleatorios
	public static int[] llenarArray(int [] ArrayNums) {
		
		for (int i=0; i < ArrayNums.length; i++) { 
			ArrayNums[i] = (int) (Math.floor(Math.random() * (300 - 1 + 1)) + 1);
		}
		return ArrayNums;
	}
	
	//Función que selecciona y guarda en un array todos los números que terminen por el número que le indiquemos
	public static void seleccionarNumsTerminadosEn(int[] ArrayNums) {
		String TextoNumero;
		int Numero;
		int ArrayNumsTerminadosEn[] = new int[ArrayNums.length];
		String NumerosTerminadosEn = "";
		
		//Mostramos una ventana para introducir el número en el que tiene que terminar
		TextoNumero = JOptionPane.showInputDialog("Introduce un numero para buscar todos los que terminen por este");
		Numero = Integer.parseInt(TextoNumero);
		
		for (int i=0; i<ArrayNums.length; i++) {
			if(ArrayNums[i] % 10 == Numero){
			ArrayNumsTerminadosEn[i]  = ArrayNums[i];
			NumerosTerminadosEn += ArrayNumsTerminadosEn[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "Los numeros generados son " + NumerosTerminadosEn);
	}
	
	//Funcion que muestra el contenido del array
	public static void mostrarArray(int[] Array) {
		String NumerosGenerados = "";
		
		for (int i=0; i<Array.length; i++) {
			NumerosGenerados += Array[i] + " ";
		}
		JOptionPane.showMessageDialog(null, "Los numeros generados son " + NumerosGenerados);
	}
}


