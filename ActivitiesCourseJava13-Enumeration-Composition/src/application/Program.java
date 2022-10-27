package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entitites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter cliente data:\nName: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY) : ");
		Date date = formatter.parse(sc.next());
		
		System.out.print("Enter order data:\nStatus: ");
		String orderStatus = sc.next();
		
		Order order = new Order(date, OrderStatus.valueOf(orderStatus), new Client(name, email, date));
		
		System.out.print("How many items to this order? ");
		int quantityNumbers = sc.nextInt();
		
		for(int contador = 1; contador <= quantityNumbers; contador++) {
			System.out.print("Enter #" + contador + " item data:\nProduct name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer quantityProducts = sc.nextInt();
			
			OrdemItem orderItem = new OrdemItem(quantityProducts, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);
		}
		
		LocalDateTime agora = LocalDateTime.now();
		
		// formatar a data
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dataFormatada = formatterData.format(agora);

		// formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);
		
		System.out.println("\nORDER SUMMARY:\nOrder moment: " + dataFormatada + " " + horaFormatada);
		System.out.println(order);
		
		sc.close();
	}

}