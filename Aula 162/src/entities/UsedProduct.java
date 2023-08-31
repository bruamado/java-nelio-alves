package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manufactureDate;
	static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return 	name +
				" (used) " +
				String.format("$ %.2f", price) +
				" (Manufacture date: " +
				formatter.format(manufactureDate) +
				")";
	}
}
