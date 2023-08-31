package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Application {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int qtdProducts = sc.nextInt();
		
		List<Product> productList = new ArrayList<>();
		
		for (int i=0; i<qtdProducts; i++) {
			System.out.printf("Product %d data: %n", (i+1));
			
			System.out.print("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			char productType = sc.nextLine().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (productType == 'i') {
				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			}else if (productType == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				Date manufactureDate = formatter.parse(sc.nextLine());
				productList.add(new UsedProduct(name, price, manufactureDate));
			}else {
				productList.add(new Product(name, price)); 
			}
		}
		sc.close();
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : productList) {
			System.out.println(product.priceTag());
		}
	}

}
