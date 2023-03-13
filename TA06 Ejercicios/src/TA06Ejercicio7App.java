
import javax.swing.JOptionPane;

public class TA06Ejercicio7App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		String TextoEuros;
		double Euros;
		String Divisa;
		
		//Mostramos una ventana para introducir la cantidad de euros que queramos convertir
		TextoEuros = JOptionPane.showInputDialog("Cuantos euros queires convertir?");
 		Euros = Double.parseDouble(TextoEuros);
 		
 		////Mostramos una ventana para introducir a la divisa que queramos convertir
 		Divisa = JOptionPane.showInputDialog("A que divisa los quieres convertir? [ Dolares | Libras | Yenes ]");
 		
 		//Llamamos a la función pasansole los parametros
 		cambiarDivisas(Euros, Divisa);
	}
	
	public static void cambiarDivisas(double Euros, String Divisa) {
		Divisa = Divisa.toUpperCase();
		double Dolar = 1.28611; 
		double Libra = 0.86;
		double Yen = 128.852;
		double ConvertirEuros = 0;
		
		if(Divisa.equals("DOLARES") || Divisa.equals("LIBRAS") || Divisa.equals("YENES")) {
			//Switch para que haga la oeración segun la divisa a la que queramos cambiar
			switch(Divisa) {
				case "DOLARES":
				ConvertirEuros = Dolar * Euros;
				Divisa = "$";
				break;
				case "LIBRAS":
				ConvertirEuros = Libra * Euros;
				Divisa = "£";
				break;
				case "YENES":
				ConvertirEuros = Yen * Euros;
				Divisa = "¥";
				break;
			}
			//Mostramos en una ventana el cambio de divisas realizado
			JOptionPane.showMessageDialog(null, Euros + " € son " + ConvertirEuros + " " + Divisa);
		} else {
			JOptionPane.showMessageDialog(null, "La divisa no es correcta");
		}
	}
}


