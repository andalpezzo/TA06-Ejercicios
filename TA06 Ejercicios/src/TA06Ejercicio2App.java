import javax.swing.JOptionPane;

public class TA06Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		String TextoCantidadNumeros;
		int CantidadNumeros;
 		String TextoNumMin;
		String TextoNumMax;
		int NumMin;
		int NumMax;
		String TotalNumeros = "";
		
		//Mostramos una ventana para introducir el numero de numero aleatorios que se van a generar
		TextoCantidadNumeros = JOptionPane.showInputDialog("¿Que cantidad de numeros aleatorios quieres quieres?");
		CantidadNumeros = Integer.parseInt(TextoCantidadNumeros);

		TextoNumMin = JOptionPane.showInputDialog("Introduce el número mínimo:");
		NumMin = Integer.parseInt(TextoNumMin);
		
		TextoNumMax = JOptionPane.showInputDialog("Introduce el número máximo:");
		NumMax = Integer.parseInt(TextoNumMax);
		
		//Creamos un array para llenarlo con los numeros aleatorios
		int NumerosAleatorios[]=new int[CantidadNumeros];
		
		//Hacemos un for para llenar el array con los numeros aleatorios que nos devuelve la función
		for (int i=0; i < CantidadNumeros; i++) { 
			NumerosAleatorios[i]=generearNumeroAleatoio(CantidadNumeros, NumMin, NumMax);
			//Ponemos todos los numeros aleatorios juntos en un string para mostrsrlos en una ventana
			TotalNumeros += NumerosAleatorios[i] + " ";
		}
		//Mostramos el resultado
		JOptionPane.showMessageDialog(null, "Los numeros aleatorios generados son: [ " + TotalNumeros + " ]");
	}
	
	public static int generearNumeroAleatoio(int CantidadNumeros, int NumMin, int NumMax) {
		int NumAleatorio;
		
		//Función para generar un numero aleatorio entre un rango de números
		NumAleatorio = (int) (Math.floor(Math.random() * (NumMax - NumMin + 1)) + NumMin);
		
		return NumAleatorio;
	}
}

