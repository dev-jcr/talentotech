package primero;
// Realizar algoritmo mediante Java que permita hacer suma, resta, multiplicación, división. Aplicar ciclo repetitivo con switch y seleccionar la operación con un menú.

import java.util.Scanner;

//public class Suma {
//    public static int numbers(int[] n);
//        i=0
//        do {}
//}

public class Calculadora {
    public static void main (String[] args) {
        
    	// Variables
    	int num1=0;
        int num2=0;
    	int resultado=0;
        Scanner teclado;
        Scanner teclado=new Scanner(System.in);
    	
        System.out.println("Qué operación desea realizar?");
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("División");
        System.out.println("Multiplicación");
        System.out.println("Escriba 'Continuar' para realizar otra operación tras finalizar.");
        String menu = teclado.next();
        System.out.println("");
        
    	do {
    		// Menú
            switch(menu) {
            
                case "Sumar":   
                    System.out.println("Ingrese el primer sumando: ");
                    num1=teclado.nextInt();
                    System.out.println("");
                    System.out.println("Ingrese el segundo sumando");
                    num2=teclado.nextInt();
                    System.out.println("");
                    resultado=num1+num2;
                    System.out.println("El resultado es: "+resultado);
                case "Restar":
                    System.out.println("Ingrese el primer número (Minuendo): ");
                    num1=teclado.nextInt();
                    System.out.println("");
                    System.out.println("Ingrese el segundo número (Sustraendo)");
                    num2=teclado.nextInt();
                    System.out.println("");
                    resultado=num1-num2;
                    System.out.println("El resultado es: "+resultado);
                case "Multiplicación":
                    System.out.println("Ingrese el dividendo (cantidad a dividir): ");
                    num1=teclado.nextInt();
                    System.out.println("");
                    System.out.println("Ingrese el divisor (en cuántos será dividido): ");
                    num2=teclado.nextInt();
                    System.out.println("");
                    resultado=num1/num2;
                    System.out.println("El resultado es: "+resultado);
                case "Dividir":
                    System.out.println("Ingrese el primer factor: ");
                    num1=teclado.nextInt();
                    System.out.println("");
                    System.out.println("Ingrese el segundo factor");
                    num2=teclado.nextInt();
                    System.out.println("");
                    resultado=num1*num2;
                    System.out.println("El resultado es: "+resultado);
                case "Continuar":
                    System.out.println("Qué operación desea realizar?");
                    System.out.println("Suma");
                    System.out.println("Resta");
                    System.out.println("División");
                    System.out.println("Multiplicación");
                    System.out.println("Escriba 'Continuar' para realizar otra operación tras finalizar.");
                    String menu = teclado.next();
                    System.out.println("");
                case "Finalizar":
                default:
                    System.out.println("Operación no soportada.");
                    System.out.println("");
                    return;
            } while (1==1);	
    	}

    }
}
