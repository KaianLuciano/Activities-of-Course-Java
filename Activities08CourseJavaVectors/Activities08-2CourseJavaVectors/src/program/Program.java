package program;

import java.util.Locale;
import java.util.Scanner;

import entitie.People;

public class Program {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Quantas pessoas serão digitadas:");
			int quantidadeDePessoas = sc.nextInt();
			
			People[] people = new People[quantidadeDePessoas];
			
			int pessoaMenos16 = 0;
			int pessoaPosição = 1;
			for(int c = 0; c < people.length; c++) {				
				System.out.println("Digite os dados da " + pessoaPosição + "º pessoa:\nNome: ");				
				String nome = sc.next();
				
				System.out.println("Idade:");
				int idade = sc.nextInt();
				
				System.out.println("Altura:");
				double altura = sc.nextDouble();
				
				if(idade < 16) {;
					pessoaMenos16++;
				}
	
				people[c] = new People(nome, idade, altura);
				pessoaPosição++;
			}
			
			double porcentagem =  People.porcentagemValor(quantidadeDePessoas, pessoaMenos16);
			System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
			
			for(int c = 0; c < people.length; c++) {
				if(people[c].getYear() < 16) {
					System.out.println(people[c].getName());
				}
			}			
		
			sc.close();
		}
}
