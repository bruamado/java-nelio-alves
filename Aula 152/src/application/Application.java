package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Application {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		String name, email, birthDateStr, status;
		int orderQtd;
		Date birthDate;
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Email: "); 
		email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDateStr = sc.nextLine();
		birthDate = formatter.parse(birthDateStr);
		
		System.out.println("Enter order data:");
		
		System.out.print("Status: ");
		status = sc.nextLine();
		System.out.print("How many items to this order? ");
		orderQtd = sc.nextInt();
		
		System.out.println();
		
		Client client = new Client(name, birthDate, email);
		Order order = new Order(client, OrderStatus.valueOf(status));
		for (int i=1; i <= orderQtd; i++) {
			String productName;
			double productPrice;
			int qty;
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			productName = sc.nextLine();
			System.out.print("Product price: ");
			productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			qty = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(qty, productPrice, product);
			order.addItem(orderItem);
		}
		sc.close();
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
	}

}
