package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment = new Date();
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	private static SimpleDateFormat dtformatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
		
	}
	
	public Order(Client client, OrderStatus status) {
		this.client = client;
		this.status = status;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}
	
	public List<OrderItem> getOrderItems() {
		return items;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double total=0.0;
		for (OrderItem i : items) {
			total += i.subTotal(); 
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + dtformatter.format(getMoment()) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: \n");
		for (OrderItem i : items) {
			sb.append(i.toString() + "\n");
		}
		sb.append(String.format("Total price: $%.2f", total()));
		
		return sb.toString();
	}
}
