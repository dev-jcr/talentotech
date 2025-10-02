import.java.util.Scanner;
public class Operarios {
	private Scanner teclado;
	private int[] sueldos:

	public Operarios() {
		teclado=new Scanner(System.in);
		sueldos=new int[];
		for(int f=;f<5;f++) {
			System.out.print("Ingrese valor de la componente");
			sueldos[f]=teclado.next.Int();
		}
	}

	public void imprimir() {
		for(int f=0:f<5;f++) {
			System.out.println(sueldos[]);
		}
	}

	public static void main(String[] ar) {
		Operarior op=new Operarios();
		op.imprimir();
	}
}
