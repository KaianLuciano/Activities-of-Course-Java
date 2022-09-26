package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int quantidadeDeNumeros;
			
			for(quantidadeDeNumeros = 11; quantidadeDeNumeros > 10; ) {
				System.out.println("Quantos número irá digitar: ");
				quantidadeDeNumeros = sc.nextInt();
				if(quantidadeDeNumeros > 10) {
					System.out.println("[ERROR] A quantidade de números digitados deverá ser menor que 10.");
				}
			}
			
			int[] number = new int[quantidadeDeNumeros];
			
			for(int c = 0; c < number.length; c++) {
				System.out.println("Digite um número: ");
				number[c] = sc.nextInt();
			}
			
			System.out.println("Quantidade de números negativos: ");

			for(int c = 0; c < number.length; c++) {
				if(number[c] < 0) {
					System.out.println(number[c]);
				}
			}
			
			sc.close();
		}
}
