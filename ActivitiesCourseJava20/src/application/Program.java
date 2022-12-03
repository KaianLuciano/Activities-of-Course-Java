package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		String path = "\\c:\\temp\\in.txt";
		File sourceFile = new File(path);
		
		try(BufferedReader bf = new BufferedReader(new FileReader(sourceFile))){
			String line = bf.readLine();
			
			while(line != null) {
				String[] field = line.split(",");
				list.add(new Product(field[0], Double.parseDouble(field[1])));
				
				line = bf.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive: ");
			System.out.println(x);
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
