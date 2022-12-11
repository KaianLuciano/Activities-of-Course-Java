package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Products> list = new ArrayList<>();
		
		System.out.println("Enter full file path: ");
		String path = sc.next();
		
		File sourceFile = new File(path);
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))){
			String line = bufferedReader.readLine();
			
			while(line != null) {
				String[] field = line.split(",");
				
				list.add(new Products(field[0], Double.parseDouble(field[1])));
				
				line = bufferedReader.readLine();
			}
			
			Double media = list.stream().map(x -> x.getPriceProduct()).reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", media));
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream().filter(x -> x.getPriceProduct() < media)
					.map(x -> x.getNameProduct()
					.toUpperCase()).sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
