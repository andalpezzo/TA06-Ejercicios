
import javax.swing.JOptionPane;

public class TA06Ejercicio11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String TextoTamañoArray;
		int TamañoArray;
		
		//Mostramos una ventana para introducir la cantidad de numeror aleatroios que queremos generar
		TextoTamañoArray = JOptionPane.showInputDialog("Indica el tamaño del array");
		TamañoArray = Integer.parseInt(TextoTamañoArray);
 		
		int Array1[] = new int[TamañoArray];
		int Array2[] = new int[TamañoArray];
 		
		//Llenamos el Array1 y lo mostramos
 		Array1 = llenarArray1(Array1);
		System.out.print("El Array1 contiene los números ");
		mostrarArray(Array1);
 		System.out.println(" ");
 		
 		//Llenamos el Array2 y lo mostramos
 		Array2 = llenarArray2(Array1, Array2);
		System.out.print("El Array2 contiene los números ");
		mostrarArray(Array2);
		System.out.println(" ");
	
		//Llamamos a la función de multiplicar
 		multiplicarArrays(Array1, Array2);
	}
	
	//Función que llena el array1 con valores aleatorios
	public static int[] llenarArray1(int [] Array1) {
		
		for (int i=0; i < Array1.length; i++) { 
			Array1[i] = (int) (Math.floor(Math.random() * (100 - 1 + 1)) + 1);
		}
		return Array1;
	}
	
	//Función que llena el Array2 con los valores del Array1 de forma aleatoria
	public static int[] llenarArray2(int [] Array1, int [] Array2) {
		int PosicionAleatroia;
	
		for (int i=0; i < Array1.length; i++) {
			PosicionAleatroia = (int) (Math.floor(Math.random() * (Array1.length - 0 + 1)) + 0);
			Array2[i] = Array1[PosicionAleatroia];
		}
		return Array2;
	}
	
	//Función que multiplica los valores de cada posición del array 
	public static void multiplicarArrays(int[] Array1, int[] Array2) {
		int ArrayMultiplicacion[] = new int[Array1.length];
		
		System.out.println(" ");
		System.out.println("Array del resulatado de las multiplicacónes de cada número de los arrays");
		for (int i=0; i<Array1.length; i++) {
			ArrayMultiplicacion[i]  = Array1[i] * Array2[i];
			System.out.print(ArrayMultiplicacion[i] + " ");
		}
	}
	
	//Funcion que muestra el contenido del array
	public static void mostrarArray(int[] Array) {
		for (int i=0; i<Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
	}
}


