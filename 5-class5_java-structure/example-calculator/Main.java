import java.util.Scanner;
public class Operacion {
	protected Scanner teclado;
	protected int valor1;
	protected int valor2;
	protected int resultado;
	public Operacion() {
		teclado=new Scanner(System.in);
	}

	public void cargar1() {
		System.out.print("Ingrese el primer valor: ";
		valor1=teclado.nextInt();
	}

	public void cargar2() {
		System.out.print("Ingrese el segundo valor: ");
		valor2=teclado.nextInt();
	}

	public void mostrarResultado(); {
		System.out.println(resultado);
	}
}

public class Suma extends Operacion {
	void operar() {
		resultado=valor1+valor2;
	}
}

public class Resta extends Operacion {
	public void operar() {
		resultado=valor1-valor2;
	}
}

public class Prueba {
	public static void main(String[]) args) {
		Suma suma1=new Suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		System.out.print("El resultado de la suma  es: ");
		suma1.mostrarResultado();
		Resta resta1=new Resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		System.out.print("El resultado de la resta es: ");
		resta1.mostrarResultado();

	
