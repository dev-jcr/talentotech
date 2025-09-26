package primero;
import java.util.Scanner;
public class Personas {
	Scanner teclado;
	String naombre;
	int edad;

	// Método inicializar.
	public void  inicializar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("ingrese edad: ");
		edad = teclado.nextInt();
	}
	
	// Método para determinar si es mayor o menor de edad.
	public void mayoredad() {
		if (edad >=18 ) {
			System.out.println("Es mayor de edad ");
		}else {
			System.out.println("Es menor de edad");
		}
	}
	
	// Método o atributo para imprimir el nombre y la edad. 
	public void imprimir() {
		System.out.println("el nombre es: " + nombre);
		System.out.println("la edad es: " + edad);
	}
	
}