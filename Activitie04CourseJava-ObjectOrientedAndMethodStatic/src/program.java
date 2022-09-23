import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hat is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.quantityDollar = sc.nextDouble();
		
		CurrencyConverter.converter();
		
		System.out.printf("Amount to be paid in reais = " + " R$ %.2f", CurrencyConverter.rate());
		
		sc.close();
	}
}
