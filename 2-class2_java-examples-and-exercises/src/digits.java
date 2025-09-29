package primero;

import java.util.Scanner;

public class digitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= Scanner(System.in);
		int digito1,digito2;
		System.out.println("Ingrese su primer dígito: ");
		digito1=teclado.nextInt();
		System.out.println("Ingrese su segundo dígito");
		digito2=teclado.nextInt();
		Math.pow(digito1, digito2);
		System.out.println(Math.pow(2,3));
	}

}
