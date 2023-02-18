package oops2;

public class Vehicle {
	String color;
	String brand;
	int price;
	int tax;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setTax(int tax) {
		this.tax=tax;
	}
	public int getTax() {
		return tax;
	}
	
	public String toString() {
		return color;
}
}
