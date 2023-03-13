
import javax.swing.JOptionPane;

public class TA06Ejercicio10App {

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
	
	//Función que llena el array
	public static void llenarArray(int CantidadNumeros) {
 		String TextoNumMin;
		String TextoNumMax;
		int NumMin;
		int NumMax;
		int NumAleatorio;
		int NumerosAleatorios[]=new int[CantidadNumeros];
		
		TextoNumMin = JOptionPane.showInputDialog("Introduce el número mínimo:");
		NumMin = Integer.parseInt(TextoNumMin);
		
		TextoNumMax = JOptionPane.showInputDialog("Introduce el número máximo:");
		NumMax = Integer.parseInt(TextoNumMax);
		
		for (int i=0; i < CantidadNumeros; i++) { 
			NumAleatorio = (int) (Math.floor(Math.random() * (NumMax - NumMin + 1)) + NumMin);
			//Comprobamos si el número es primo y si no volvemos atras un indice para volver a generar otro número aleatorio
			if (esPrimo(NumAleatorio) == true) {
	 			NumerosAleatorios[i] = NumAleatorio;
	 		} else {
	 			i--;
	 		}
		}
		
		//Llamamos a la función para mostrar el array
		mostrarArray(NumerosAleatorios);
	}
	
	//Función que mira si el número es primo
	public static boolean esPrimo(int NumAleatorio) {
		int i = 2;
		boolean EsPrimo = true;
		int cont = 0;
		
        for (i = 1; i <= NumAleatorio; i++) {
            if (NumAleatorio % i == 0) {
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
	
	//Función que busca el número mas grande del array 
	public static int numMayor (int[] NumerosAleatorios) {
		int NumMayor = NumerosAleatorios[0];
		
		for (int i=0; i < NumerosAleatorios.length; i++) {
			if (NumerosAleatorios[i] > NumMayor) {
				NumMayor = NumerosAleatorios[i];
			}
		}
		
		return NumMayor;
	}
	
	//Funcion que muestra el array y el número mas grande
	public static void mostrarArray(int[] NumerosAleatorios) {
		
		System.out.print("Los números primos aleatorios generados son ");
		for (int i=0; i<NumerosAleatorios.length; i++) {
			System.out.print(NumerosAleatorios[i] + " ");
		}
		System.out.println();
		System.out.println("El número mayor es " + numMayor(NumerosAleatorios));
	}
}


