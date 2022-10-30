package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();
		
		for(int contador = 1; contador <= numberEmployees; contador++) {
			System.out.print("Employee " + contador + "# data: \nOutsourced (y/n)? ");
			char outSourced = sc.next().charAt(0);
			
			if(outSourced == 'y' || outSourced == 'Y') {
				System.out.print("\nName: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("\nHour: ");
				int hours = sc.nextInt();
				
				System.out.print("\nValue per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				System.out.print("\nAdditional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} 
			else
			{
				System.out.print("\nName: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("\nHour: ");
				int hours = sc.nextInt();
				
				System.out.print("\nValue per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}
		
		System.out.println("\nPayments: ");
		for(Employee x : list) {
			if(x instanceof OutSourcedEmployee) {
				System.out.println(x.getName() + " - $ " + x.payment());
			}
			else
			{
				System.out.println(x.getName() + " - $ " + x.payment());
			}
		}
		sc.close();
	}

}
