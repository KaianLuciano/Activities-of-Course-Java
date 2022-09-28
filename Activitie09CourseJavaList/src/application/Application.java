package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Employee;

public class Application {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int nPeoples = sc.nextInt();
		
		for(int c = 0; c < nPeoples; c++) {
			System.out.println("Emplyoee #" + (c + 1) + ":\nId: ");
			int id = sc.nextInt();
			
			while(hasID(list, id)) { 
				System.out.println("Entered number already exists, enter again");
				id = sc.nextInt();
			}
			
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increase :");
		int idSalary = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		for(Employee x: list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static boolean hasID(List<Employee> list, int id ) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}	
}
