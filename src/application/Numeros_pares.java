package application;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.print("Digite um numero: \n");
			vect[i] = sc.nextInt();
		}
		int pares = 0;
		
		System.out.println("\nNUMEROS PARES: ");

		
		for (int i = 0; i<vect.length; i++) {
			if (vect[i] % 2 ==0) {
				pares += 1;
				System.out.printf("%d ", vect[i]);
			}
		}
		System.out.println("\n\nQUANTIDADE DE PARES = " + pares);
		
		sc.close();

	}

}
