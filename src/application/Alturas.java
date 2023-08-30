package application;

import java.util.Locale;
import java.util.Scanner;



public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] vect1 = new String[n];
		int[] vect2 = new int[n];
		double[] vect3 = new double[n];
		
		for (int i = 0; i<n; i++) {
			
			System.out.printf("Dados da %da pessoa: ", i + 1);
			System.out.println();
			System.out.print("Nome: ");
			vect1[i] = sc.nextLine();
			sc.nextLine();
			System.out.print("Idade: ");
			vect2[i] = sc.nextInt();
			System.out.print("Altura: ");
			vect3[i] = sc.nextDouble();
		}
		double soma = 0.0;
		int menor = 0;
		
		for (int i = 0; i<n; i++) {
			soma += vect3[i];
			if (vect2[i] < 16) {
				menor += 1;
			}
		}
		
		double avg = soma / n;
		double porcentagem = menor * 100 /n;
		
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n ", porcentagem);
		
		for (int i = 0; i<n; i++) {
			if (vect2[i] < 16) {
				System.out.printf("%s\n", vect1[i]);
			}
		}
		sc.close();
	}

}
