package primero;
import java.util.Scanner;
public class execute {
    public static void main(String[] args)  {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese color: ");
        ColorLuz=teclado.next();
        switch(ColorLuz)    {
            case  "Verde":
                System.out.println("Continuar avanzando");
                break;
            case  "Amarillo":
                System.out.println("Reducir velocidad");
                break;
            case  "Rojo":
                System.out.println("Detenerse");
                break;
            default:
            	System.out.println("Entrada inválida");
        }
    }
} 