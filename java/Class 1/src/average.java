package primero;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
    	
    	Scanner teclado= new Scanner(System.in);
    	int nota1,nota2,nota3,nota4,prom=0;
        System.out.println("Ingrese su primera nota: ");
        nota1=teclado.nextInt();
        System.out.println("Ingrese su segunda nota: ");
        nota2=teclado.nextInt();
        System.out.println("Ingrese su tercera nota: ");
        nota3=teclado.nextInt();
        System.out.println("Ingrese su cuarta nota: ");
        nota4=teclado.nextInt();

        prom=(nota1+nota2+nota3)/3;
        
        if (prom>=7) {
            System.out.print("Promovido. Excelente");
        }else
            if(prom>=5) {
                    System.out.print("Promovido. Regular");
            }else
                System.out.print("Reprobado. Malo");
    }
}
