package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitites.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrdemItem> items = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrdemItem> getItems() {
		return items;
	}
	
	public void addItem(OrdemItem item) {
		items.add(item);
	}
	
	public void removeItem(OrdemItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrdemItem order : items) {
			total += order.subTotal();
		}
		return total;
	}
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " ");
		sb.append("(" + formatter.format(client.getBithDate()) + ") ");
		sb.append("- " + client.getEmail() + "\n");
		sb.append("Order items:\n");
		for(OrdemItem order : items) {
			sb.append(order.getProduct().getName());
			sb.append(", $" + order.getProduct().getPrice());
			sb.append(", Quantity: " + order.getQuantity());
			sb.append(", Subtotal: " + "$" + order.subTotal() + "\n");
		}
		sb.append("Total price: $" + total());
		return sb.toString();
	}
	
}
