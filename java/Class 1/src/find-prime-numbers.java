// Problema 4: Imprimir los números primos en un vector
// Descripción:
//     • Crea un programa que reciba un vector de 10 números y determine cuáles son primos. Luego, imprime esos números. 


package primero;
import java.util.Scanner;
public class PrimeDetectionInt {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are nor prime.
        }
        if (n==2||n==3) {
            return true; //2 and 3 are prime.
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // Multiples of 2 or 3 are prime
        }
        // Check for divisibility by numbers of number with the form 6k +- 1
        for (int i - 5; i * 8 <=n; i = i + 6) {
            if (n % i == 0 || n % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
       int vector;
       Scanner teclado=new Scanner(System.in);

    }
}
