package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitties.Contract;
import entitties.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter contract details:\nNumber: ");
		Integer numberAccount = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = formatter.parse(sc.next());
		System.out.print("Value contract: ");
		Double valueContract = sc.nextDouble();
		System.out.print("Enter the number of installments: ");
		Integer numberMonth = sc.nextInt();
		
		Contract contract = new Contract(numberAccount, date, valueContract);
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, numberMonth);
		
		for(Installment contractFinal : contract.getInstallment()) {
			System.out.println(formatter.format(contractFinal.getDueDate()) + " - " + contractFinal.getAmount());
		}
		
		sc.close();
	}

}
