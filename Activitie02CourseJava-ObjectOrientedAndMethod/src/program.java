import java.util.Locale;
import java.util.Scanner;

public class program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employe = new Employee();
		
		System.out.println("Insert your name: ");
		employe.Name = sc.nextLine();
		
		System.out.println("Insert you gross salary: ");
		employe.GrossSalary = sc.nextDouble();
		System.out.println("Insert you Tax: ");
		employe.Tax = sc.nextDouble();
		
		System.out.println(employe);
		
		System.out.println("Whit percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		employe.IncreaseSalary(porcentagem);
		
		System.out.println(employe);
		sc.close();
	}
}
