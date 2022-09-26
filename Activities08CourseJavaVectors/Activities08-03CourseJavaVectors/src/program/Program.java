package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quantos números irá digitar: ");
			int quantidadeNumeros = sc.nextInt();
			
			int[] numero = new int[quantidadeNumeros];
			
			for(int c = 0; c < numero.length; c++) {
				System.out.println("Digite um número: ");
				numero[c] = sc.nextInt();
			}
			
			int quantidadePares = 0;
			
			System.out.println("Números pares: ");
			
			for(int c = 0; c < numero.length; c++) {
				if(numero[c] % 2 == 0) {
					System.out.print(numero[c] + "  ");
					quantidadePares++;
				}
			}

			System.out.println("\nQuantidade de pares: " + quantidadePares);
			
			sc.close();
		}
}
