import java.util.Scanner;
public class TablaMultiplicar {
	
	public  cargarValor() {
		Scanner teclado=new Scanner(System.in);
		int valor;
		do {
			System.out.println("Ingrese valor: ");
			valor=teclado.nextInt();
			if (valor!=-1)	{
				calcular(valor);
			}
			System.out.println();
		} while (valor!=-1);
	}

	public void calcular(int v) {
		for(int f=1;f<=10;f++)	{
			System.out.println(v +"*"+f + " = " +f*v);
		}
	
