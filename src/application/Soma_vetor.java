package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.print("VALORES = ");
		
		double soma = 0.0;
		
		for (int i = 0; i<n; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];			
		}
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		double avg = soma / n;
		System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();

	}

}
