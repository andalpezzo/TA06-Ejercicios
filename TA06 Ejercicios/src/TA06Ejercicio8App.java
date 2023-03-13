
import javax.swing.JOptionPane;

public class TA06Ejercicio8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int nums[] = new int[10];
 		
 		//Llamamos a la función pasansole los parametros
 		llenarArray(nums);
 		mostrarArray(nums);
	}
	
	public static int[] llenarArray(int[] nums) {
		String TextoNum;
		int Num;
		
		for (int i=0; i<nums.length; i++) {
			TextoNum = JOptionPane.showInputDialog("Introduce un número?");
	 		Num = Integer.parseInt(TextoNum);
	 		nums[i] = Num;
		}
		return nums;
	}
	
	public static void mostrarArray(int[] nums) {
		for (int i=0; i<nums.length; i++) {
			System.out.println("El valor del indice " + i + " es " + nums[i]);
		}
	}
}


