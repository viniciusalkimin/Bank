import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();

		System.out.print("Is there na initial deposit value (y/n)? ");
		char option = sc.next().charAt(0);

		if (option =='y') {
			System.out.print("Enter initial deposit value: R$");
			double initDeposit = sc.nextDouble();			
			account = new Account(accountNumber, accountHolder, initDeposit);
			System.out.println(account.toString());

		} else {
			account = new Account(accountNumber, accountHolder);
			System.out.println();
			System.out.println(account.toString());
		}

		System.out.println();
		System.out.print("Enter a deposit value: R$");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Account Data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: R$");
		amount = sc.nextDouble();
		System.out.println("Account Data:");
		account.withdraw(amount);
		
		System.out.println(account);
		sc.close();
	}
}