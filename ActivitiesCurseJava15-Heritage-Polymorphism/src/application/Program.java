package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProducts;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		for(int contador = 1; contador <= numberProducts; contador++) 
		{
			System.out.print("\nProduct #" + contador + " data:\nCommon, used or imported (c/u/i)? ");
			char originProduct = sc.next().charAt(0);
			
			if(originProduct == 'c' || originProduct == 'C') 
			{
				System.out.print("\nName: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("\nPrice: ");
				Double price = sc.nextDouble();
				
				Product product = new Product(name, price);
				list.add(product);
			}
			else
			{
				if(originProduct == 'u' || originProduct == 'U') 
				{
					System.out.print("\nName: ");
					sc.nextLine();
					String name = sc.nextLine();
					
					System.out.print("\nPrice: ");
					Double price = sc.nextDouble();
					
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date date = formatter.parse(sc.next());
					
					Product product = new UsedProduct(name, price, date);
					list.add(product);
				}
				else
				{
					System.out.print("\nName: ");
					sc.nextLine();
					String name = sc.nextLine();
					
					System.out.print("\nPrice: ");
					Double price = sc.nextDouble();
					
					System.out.print("\nCustom fee: ");
					Double customFee = sc.nextDouble(); 
					
					Product product = new ImportedProducts(name, price, customFee);
					list.add(product);
				}
			}
		}
		
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}
