// This programs counts numbers until the input from the user
package primero;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
    	
    	Scanner teclado=new Scanner(System.in);
            int n,x;
            System.out.println("Ingrese el valor final: ");
            n=teclado.nextInt();
            x=1;
            while (x<=n) {
                System.out.print(x);
                System.out.print(" - ");
                x = x + 1;
            }
    }
}