import java.util.Locale;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.println("Enter rectangle width an height: ");
		retangle.whidth = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		double area = retangle.Area();
		double perimetro = retangle.Perimeter();
		double diagonal = retangle.Diagonal();
		
		System.out.println("AREA = " + area);
		System.out.println("Perimetro " + perimetro);
		System.out.println("Diagonal: " + diagonal);
		
		sc.close();
	}
}
