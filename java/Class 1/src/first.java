/**
 * 
 */
package primero;

/**
 * 
 */
import java.util.*;

public class Primero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// 		TODO Auto-generated method stub
//		System.out.println("hola mundo");
		
		int num1, num2, R;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese primer número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese segundo número: ");
		num2 = teclado.nextInt();
		
		R = num1 + num2;
		System.out.println("Resultado: " + R);

	}

}