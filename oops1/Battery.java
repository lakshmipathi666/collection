package oops1;

public class Battery {
	private int capacity;
	private int price;
	
	public Battery(int capacity, int price) {
		this.capacity=capacity;
		this.price=price;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
		
	}
	public int getCapacity() {
		return capacity;
		
	}
	public void getPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return capacity+" "+price;
	}
}
