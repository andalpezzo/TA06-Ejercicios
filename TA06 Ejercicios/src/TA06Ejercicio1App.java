import javax.swing.JOptionPane;

public class TA06Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		String TipoDeFigura;
		
		double Radio = 0.0;
		double Base = 0.0;
		double Altura = 0.0;
		double Lado = 0.0;
		
		double Resultado;
		
		//Mostramos una ventana para introducir el tipo de figura
		TipoDeFigura = JOptionPane.showInputDialog("¿Que tipo de figura quieres calcular? [ Circulo | Triangulo | Cuadrado ]");
		
		//Pasamos el texto todo a mayusculas para que de igual como se escriba. Siempre lo va a detectar como correcto
		TipoDeFigura = TipoDeFigura.toUpperCase(); 
		
		//Switch para que se ejecute la función necesaria segun el tipo de figura
		switch (TipoDeFigura) {
		case "CIRCULO":
			//Llamamos a la función pasandole el radio 
			Resultado = calcularAreaCirculo(Radio);
			
			//Mostramos el resultado
			JOptionPane.showMessageDialog(null, "El area del circulo es " + Resultado);
			break;
			
		case "TRIANGULO":
			//Llamamos a la función pasandole la base y la altura 
			Resultado = calcularAreaTriangulo(Base, Altura);
			
			//Mostramos el resultado
			JOptionPane.showMessageDialog(null, "El area del triángulo es " + Resultado);
			break;
			
		case "CUADRADO":
			//Llamamos a la función pasandole el lado 
			Resultado = calcularAreaCuadrado(Lado);
			
			JOptionPane.showMessageDialog(null, "El area del circulo es " + Resultado);
			break;	
		}
	}
	
	public static double calcularAreaCirculo(double Radio) {
		String TextoRadio;
		double Resultado;
		
		TextoRadio = JOptionPane.showInputDialog("Introduce el radio:");
		Radio = Double.parseDouble(TextoRadio);
		
		Resultado = Math.pow(Radio, 2)*Math.PI;
		
		return Resultado;
	}

	public static double calcularAreaTriangulo(double Base, double Altura) {
		String TextoBase;
		String TextoAltura;
		double Resultado;
		
		TextoBase = JOptionPane.showInputDialog("Introduce la base:");
		Base = Double.parseDouble(TextoBase);
		
		TextoAltura = JOptionPane.showInputDialog("Introduce la altura:");
		Altura = Double.parseDouble(TextoAltura);
		
		Resultado = Base*Altura/2;
		
		return Resultado;
	}
	
	public static double calcularAreaCuadrado(double Lado) {
		String TextoLado;
		double Resultado;
		
		TextoLado = JOptionPane.showInputDialog("Introduce el lado:");
		Lado = Double.parseDouble(TextoLado);
		
		Resultado = Lado*Lado;
		
		return Resultado;
	}
}
