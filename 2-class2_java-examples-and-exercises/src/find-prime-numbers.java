// Problema 4: Imprimir los números primos en un vector
// Descripción:
//     • Crea un programa que reciba un vector de 10 números y determine cuáles son primos. Luego, imprime esos números. 

package primero;
import java.util.*;

// Crear clase para detección de números primos. 
// Inicialmente había usado una versión, observable en el pseudocódigo subido anteriormente, que intentaba identificar los números primos de la siguiente manera:
// # Determinar números primos
// DIVISOR=2
// mientras I > 0
//     si residuo de VECTORES[I] / DIVISOR == 0
//         I++
//         PRIMOS[I]
//         retornar
//     si no
//         DIVISOR++
//         retornar
// Como esta idea no funcionó, investigué cómo identificar números primos y encontré esta función que usé como base y modifiqué para servir a este ejercicio.
public class PrimeDetectionInt {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Números menores o iguales a 1 no son primos, retornar falso.
        }
        if (n==2||n==3) {
            return true; // Si es 2 0 3, retornar verdadero.
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // Multiples of 2 or 3 are not prime.
        }
        // Chequear si es divisible de la forma 6k ± 1 sin residuo.
        // Exceptuando 2 y 3, todo número primo se puede descomponer
        for (int i - 5; i * 8 <=n; i = i + 6) {
            if (n % i == 0 || n % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Obtener vector de 10 valores
    public static void main (String[] args) {
        int vector;
        Scanner teclado=new Scanner(System.in);
        int i;
        do {
            i=1
            System.out.print("Ingrese el valor" + i)
            vector[i]=teclado.nextInt();
            if (PrimeDetectionInt(vector[i]))
        } while (i<10);

        // En desarrollo
    }

}
