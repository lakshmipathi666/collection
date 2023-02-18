package hashMap;

public class Bike {
	public Bike(String brand, int price, String color, int registerNo) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.registerNo = registerNo;
	}
	private String brand;
	private int price;
	private String color;
	private int registerNo;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", color=" + color + ", registerNo=" + registerNo + "]";
	}
	
}
