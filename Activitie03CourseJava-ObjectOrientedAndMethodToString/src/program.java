import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas notas = new Notas();
		
		System.out.println("Insert name or student: ");
		notas.name = sc.nextLine();
		System.out.println("Insert note for quarter :\n1º [0 - 30.00]\n2º [0 - 30.00]\n3º [0 - 35.00]");
		
		notas.nota1 = sc.nextFloat();
		notas.nota2 = sc.nextFloat();
		notas.nota3 = sc.nextFloat();
		
		notas.mediaFinal();
		System.out.println(notas.toString());
		
		sc.close();
	}
}
