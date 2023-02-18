package oops1;

public class Car {
	private String brand;
	private int price;
	private String color;
	private Engine engine;
	
	public void setBrand(String brand) {
		this.brand=brand;
		
	}
	public String getBrand() {
		return brand;
		
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return engine;
	}
}
