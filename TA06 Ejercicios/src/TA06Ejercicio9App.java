
import javax.swing.JOptionPane;

public class TA06Ejercicio9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String TextoCantidadNumeros;
		int CantidadNumeros;
		
		//Mostramos una ventana para introducir la cantidad de numeror aleatroios que queremos generar
		TextoCantidadNumeros = JOptionPane.showInputDialog("¿Que cantidad de numeros aleatorios quieres quieres?");
		CantidadNumeros = Integer.parseInt(TextoCantidadNumeros);
 		
 		//Llamamos a la función pasansole los parametros
 		llenarArray(CantidadNumeros);
	}
	
	public static void llenarArray(int CantidadNumeros) {
 		String TextoNumMin;
		String TextoNumMax;
		int NumMin;
		int NumMax;
		int NumerosAleatorios[]=new int[CantidadNumeros];
		
		TextoNumMin = JOptionPane.showInputDialog("Introduce el número mínimo:");
		NumMin = Integer.parseInt(TextoNumMin);
		
		TextoNumMax = JOptionPane.showInputDialog("Introduce el número máximo:");
		NumMax = Integer.parseInt(TextoNumMax);
		
		for (int i=0; i < CantidadNumeros; i++) { 
			NumerosAleatorios[i] = (int) (Math.floor(Math.random() * (NumMax - NumMin + 1)) + NumMin);
		}
		mostrarArray(NumerosAleatorios);
	}
	
	public static void mostrarArray(int[] NumerosAleatorios) {
		int SumaTotal = 0;
		
		System.out.print("Los números aleatorios generados son ");
		for (int i=0; i<NumerosAleatorios.length; i++) {
			System.out.print(NumerosAleatorios[i] + " ");
			SumaTotal += NumerosAleatorios[i];
		}
		System.out.println();
		System.out.println("La suma total de los números es " + SumaTotal);
	}
}


