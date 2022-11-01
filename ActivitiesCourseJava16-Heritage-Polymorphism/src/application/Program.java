package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> listTaxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		
		for(int contador = 1; contador <= taxPayers; contador++) {
			System.out.print("Tax payer #" + contador + " data\nIndividual or company (i/c)? ");
			char individualCompany = sc.next().charAt(0);
			
			if(individualCompany == 'i' || individualCompany == 'I') {
				System.out.print("\nName: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("\nAnual income: ");
				Double anualIncome = sc.nextDouble();
				
				System.out.print("\nHealth expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				TaxPayer taxPayer = new Individual(name, anualIncome, healthExpenditures);
				listTaxPayer.add(taxPayer);
			}
			else 
			{
				System.out.print("\nName: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("\nAnual income: ");
				Double anualIncome = sc.nextDouble();
				
				System.out.print("\nNumber of employees: ");
				int healthExpenditures = sc.nextInt();
				
				TaxPayer taxPayer = new Company(name, anualIncome, healthExpenditures);
				listTaxPayer.add(taxPayer);
			}
		}
			
		Double totalTax = 0.0;
		
		System.out.println("TAXES PAID:");
		for(TaxPayer taxPayer : listTaxPayer) {
			double tax = taxPayer.tax();
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax));
			 totalTax += tax;
		}
				
		System.out.println("\nTOTAL TAXES: $ " + totalTax);
		
		sc.close();
	}

}