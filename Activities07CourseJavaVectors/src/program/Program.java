package program;

import java.util.Locale;
import java.util.Scanner;

import entitie.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of products: ");
		int numberProducts = sc.nextInt();
		
		Product[] vect = new Product[numberProducts];
		double sum = 0.0;
		
		for(int c = 0; c < vect.length; c++) {
			System.out.println("Enter name product: " );
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Enter a price the product: ");
			double price = sc.nextDouble();
			
			vect[c] = new Product(name, price);
			sum += vect[c].getPrice();
		}
		
		double media = sum / vect.length;
		
		System.out.printf("Avarage Price: %.2f%n", media);
		
		sc.close();
		
	}
}