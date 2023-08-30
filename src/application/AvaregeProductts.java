package application;

import java.util.Scanner;

import entities.Productt;

import java.util.Locale;


public class AvaregeProductts {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Productt[] vect = new Productt[n];   // Criou o objeto mas ele está vazio.
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Productt(name, price); // Instancia o objeto criado anteriormente, para cada indice do vetor.
		}
		
		double sum = 0.0;
		for (int i = 0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		
		sc.close();

	}

}
