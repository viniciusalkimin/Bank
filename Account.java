package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	
	public Account() {
		
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
		
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	
	public void withdraw(double amount) {
		this.accountBalance -= amount + 5.0;
	}

	@Override
	public String toString() {
		return "Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Account Balance: R$"
				+ String.format("%.2f", accountBalance);
	}

}
