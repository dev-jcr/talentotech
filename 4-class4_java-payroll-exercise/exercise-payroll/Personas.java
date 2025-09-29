package primero;
import java.util.Scanner;
public class Personas {
	Scanner teclado;
	String Nombre;
    String Apellido;
    String Cargo;
    int DLaborados;
    double PagoNeto;
    int Salario;
    double Salud;

	// Método inicializar.
	public void  inicializar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		Nombre = teclado.nextLine();
		System.out.println("Ingrese apellido: ");
		Apellido = teclado.nextLine();
        System.out.println("Ingrese Cargo: ");
        Cargo = teclado.nextLine();
        System.out.println("Ingrese salario base: ");
        Salario = teclado.nextInt();
        System.out.println("Ingrese días laborados: ");
        DLaborados = teclado.nextInt();
	}
	
	// Método para determinar deducciones
	public double salud() {
        Salud=Salario*0.04;
        return Salud;
	}
	
	public double neto() {
        PagoNeto=Salario-Salud;
        return PagoNeto;
	}
	
	// Método o atributo para imprimir el nombre y la edad. 
	public void imprimir() {
		System.out.println("Empleado: " + Nombre + Apellido);
		System.out.println("Cargo: " + Cargo);
        System.out.println("Salario base: " + Salario);
        System.out.println("Días laborados: " + DLaborados);
        System.out.println("Deducción de Salud: " + Salud);
        System.out.println("Pago neto: " + PagoNeto);

	}
	
}