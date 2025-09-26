package primero;

//Realizar un pequeño aplicativo en Java que nos permita generar la nómina para 4 trabajadores y presentar los siguientes métodos: 
//Ingreso de datos (atributos: nombre, apellido, cargo, salario base, número de días laborados y neto a pagar)
//Deducciones (atributos: determinar el valor de la salud tomando en consideración que se le hace un descuento por salud del 4%)
//Visualizar o imprimir el resumen de la nómina.

public class main {
	public static void main(String[] args) {
		Personas persona1;
		persona1=new Personas();
		persona1.inicializar();
		persona1.neto();
		persona1.salud();
		persona1.imprimir();
		
		Personas persona2;
		persona2=new Personas();
		persona2.inicializar();
		persona2.neto();
		persona2.salud();
		persona2.imprimir();
		
		Personas persona3;
		persona3=new Personas();
		persona3.inicializar();
		persona3.neto();
		persona3.salud();
		persona3.imprimir();
		
		Personas persona4;
		persona4=new Personas();
		persona4.inicializar();
		persona4.neto();
		persona4.salud();
		persona4.imprimir();
	}

}