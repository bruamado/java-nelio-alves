package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
		
	}
	
	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Double subTotal() {
		return price*quantity;
	}
	
	@Override
	public String toString() {
		return product.getName()
				+ ", $" + String.format("%.2f", price)
				+ ", Quantity: " + getQuantity()
				+ ", Subtotal: $" + String.format("%.2f", subTotal());
	}
}
