package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the departamen´s name: ");
		String departamentName = sc.nextLine();
		
		System.out.println("Enter work data:\nName: ");
		String workerName = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.println("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		
		System.out.print("How many contracts to this worker? ");
		Integer totallyContracts = sc.nextInt();

		for(int contador = 1; contador <= totallyContracts; contador++)
		{
			System.out.print("Enter contract #" + contador + " data:\nDaet (DD/MM/YYYY): ");
			Date date = formatter.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int durationHour = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, durationHour);
			worker.addContract(contract);
			contract.totalValue();
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String dateRequired = sc.next();
		int month = Integer.parseInt(dateRequired.substring(0,2));
		int year = Integer.parseInt(dateRequired.substring(3));;
		
		System.out.println("Name: " + worker.getName() + "\nDepartament: " + worker.getLevel() + "\nIncome for " + month + "/" + year + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}
}
