package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAcount;

public class Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAcount account;
		
		System.out.print("Enter a account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAcount(number, holder, initialDeposit);
		}
		else {
			account = new BankAcount(number, holder);
		}

		System.out.println();
		System.out.println("Accont data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		account.withdraw(withDrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		
		
		sc.close();

	}

}
