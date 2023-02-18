package collection;

public class Bike {
	private String brand;
	private int price;
	private String color;
	private boolean isAutomatic;
	
	public Bike(String brand,int price,String color,boolean isAutomatic) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isAutomatic=isAutomatic;
		
	}
	
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
	public void setIsAutomatic(boolean isAutomatic) {
		this.isAutomatic=isAutomatic;
	}
	public boolean getIsAutomatic() {
		return isAutomatic;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+isAutomatic;
	}
	
}
