package programa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números vai digitar: ");
		int quantidadeNumeros = sc.nextInt();
		
		double[] numero = new double[quantidadeNumeros];
		
		double maiorNumero = 0;
		int posicaoMaiorNumero = 0;
		for(int c = 0; c < numero.length; c++) {
			System.out.println("Digite um número: ");
			numero[c] = sc.nextDouble();
			if(numero[c] > maiorNumero) {
				maiorNumero = numero[c];
				posicaoMaiorNumero = c;
			}
		}
		
		System.out.println("Maior número: " + maiorNumero + "\nPosição do maior número: " + posicaoMaiorNumero);
		
		
		sc.close();
	}
}
