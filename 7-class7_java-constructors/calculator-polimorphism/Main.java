public class Main {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.sumar(5,10)); // Usa sumar(int, int)
		System.out.println(calc.sumar(5,10,15)); // Usar sumar(int, int, int)
		System.out.println(calc.sumar(5.5,3.2)); // Usa sumar(double,double)
	}
}

				
