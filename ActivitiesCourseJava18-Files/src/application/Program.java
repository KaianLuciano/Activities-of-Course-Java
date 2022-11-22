package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Products> list = new ArrayList<>();
		
		System.out.println("Enther the folder path: ");
		String sourceFolderStr = sc.nextLine();
		
		File sourceFolder = new File(sourceFolderStr);
		File targetFolderStr = new File(sourceFolder.getParent());
				
		boolean sucess = new File(targetFolderStr + "\\out").mkdir();
				
		String targetFolder = targetFolderStr + "\\out\\summary.txt";		
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFolderStr))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] field = line.split(",");
				String name = field[0];
				Double price = Double.parseDouble(field[1]);
				Integer quatity = Integer.parseInt(field[2]);
				
				list.add(new Products(name, price, quatity));
				
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFolder))){
					for(Products listProducts : list) {
						bw.write(listProducts.getName() + ", " + listProducts.total());
						bw.newLine();
					}
				}
				catch (IOException e) {
					System.out.println("ERROR: " + e.getMessage());
				}
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		System.out.println("Folder Create: " + sucess);
		
		sc.close();
	}
}
