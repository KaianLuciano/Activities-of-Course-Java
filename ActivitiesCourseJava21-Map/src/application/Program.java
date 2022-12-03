package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> candidateWishes = new HashMap<>();
		
		System.out.println("Enter file full path: ");
		String path = sc.next();
		
		File sourceFile = new File(path);
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))){
			String line = bufferedReader.readLine();
			
			
			while(line != null) {
				String[] field = line.split(",");
				
				if(candidateWishes.containsKey(field[0])) {
					candidateWishes.put(field[0], Integer.parseInt(field[1]) + candidateWishes.get(field[0]));
				}
				else {
					candidateWishes.put(field[0], Integer.parseInt(field[1]));
				}
				
				line= bufferedReader.readLine();
			}
			
			for(String key : candidateWishes.keySet()) {
				System.out.println(key + ": " + candidateWishes.get(key));
			}
			
			
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		sc.close();
	}
	
}