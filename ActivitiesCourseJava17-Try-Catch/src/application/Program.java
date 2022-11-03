package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withDrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withDrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			account.withDraw(sc.nextDouble());
			
			System.out.println(account);
		}
		catch (DomainException e) 
		{
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e)
		{
			System.out.println("insepered error");
		}
		sc.close();
	}

}