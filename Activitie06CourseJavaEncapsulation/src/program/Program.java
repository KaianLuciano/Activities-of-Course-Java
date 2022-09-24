package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

		public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account Number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account Holder: ");
		String accountHolder = sc.nextLine();
		accountHolder = sc.nextLine();
		
		
		System.out.println("Enter initial deposit value ? [y/n] ");
		char startDeposit = sc.next().charAt(0);
			
		double valueDeposit;
		
		Bank bank;
		if(startDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			valueDeposit = sc.nextDouble();
			bank = new Bank(accountNumber, accountHolder, valueDeposit);
		} else {
			bank = new Bank(accountNumber, accountHolder);
		}
	
		System.out.println("Account Data:\nAccount " + bank.getNumber() + "," + " Holder: " + bank.getAccountHolder() + ", Balance: $ " + bank.getDeposit());
		
		System.out.println("Enter a deposit value: " );
		valueDeposit = sc.nextDouble();
		bank.deposit(valueDeposit);
		
		System.out.println(bank.toString());
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bank.withdrawValue(withdrawValue);
		
		System.out.println(bank.toString());
		
		sc.close();
		}
}
