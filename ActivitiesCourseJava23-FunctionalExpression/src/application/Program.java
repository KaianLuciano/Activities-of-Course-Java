package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter full file path: ");
		String path = sc.next();
		
		System.out.println("Enter salary: ");
		Double salary = sc.nextDouble();
		
		File sourceFile = new File(path);
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))){
			String line = bufferedReader.readLine();
			
			while(line != null) {
				String[] field = line.split(",");
				
				list.add(new Employee(field[0], field[1], Double.parseDouble(field[2])));
				
				line = bufferedReader.readLine();
			}
			
			List<String> emailEmployees = list.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted().collect(Collectors.toList());
			emailEmployees.forEach(System.out::println);
			
			Double totalSalaray = list.stream().filter(x -> x.getName().toUpperCase().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x,y) -> x + y);
			System.out.print("Sum of salary of people whose name starts with 'M': " + totalSalaray);
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		sc.close();
	}

}