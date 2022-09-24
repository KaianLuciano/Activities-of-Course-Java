package entities;

public class Bank {
	private int accountNumber;
	public String accountHolder;
	private double accountBalance;
	
	public Bank(int accountNumber, String accountHolder, double inicialValue) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(inicialValue);
	}
	
	public Bank(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public double getDeposit() {
		return accountBalance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public int getNumber() {
		return accountNumber;
	}
	
	public void deposit(double accountBalance) {
		this.accountBalance += accountBalance;
	}
	
	public void withdrawValue (double withdrawValue) {
		this.accountBalance -= withdrawValue + 5.00;
	}
	
	public String toString() {
		return "Update acount Data:\n"
				+ "Account: "
				+ accountNumber
				+ ", "
				+ "Holder: "
				+ accountHolder
				+ " Balance: $ "
				+ accountBalance;	
	}
}