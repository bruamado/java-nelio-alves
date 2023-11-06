package Entities;

public class Product {
    String name;
    Double price;
    Integer qty;

    public Product(){

    }

    public Product (String name, Double price, Integer qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getTotalPrice(){
        return qty*price;
    }

    @Override
    public String toString(){
        return String.format("Name: %s - Price: %s - Quantity: %s - TotalPrice: %s", name, price, qty, getTotalPrice());
    }
}
