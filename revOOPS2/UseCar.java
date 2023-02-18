package revOOPS2;

public class UseCar {
	public static void main(String[] args) {
		Door d=new Door();
		d.setBrand("godrej");
		d.setModel("IND007");
		d.setStock(17);
		
		
		Car c=new Car();
		c.setBrand("Hyundai");
		c.setColor("Red");
		c.setPrice(1500000);
		c.setDoor(d);
		
		System.out.println(c.getBrand()+" "+c.getColor()+" "+c.getPrice()+" "+c.getDoor().getBrand()+" "+c.getDoor().getModel()+" "+c.getDoor().getStock());
		
	}
}
class Car {
	private String brand;
	private String color;
	private int price;
	private Door door;
	public void setBrand(String brand) {
		this.brand=brand;	
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color=color;	
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price=price;	
	}
	public int getPrice() {
		return price;
	}
	public void setDoor(Door door) {
		this.door=door;	
	}
	public Door getDoor() {
		return door;
	}
	
}
class Door {
	private String brand;
	private String model;
	private int stock;
	
	public void setBrand(String brand) {
		this.brand=brand;	
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String mode) {
		this.model=model;	
	}
	public String getModel() {
		return model;
	}
	public void setStock(int stock) {
		this.stock=stock;	
	}
	public int getStock() {
		return stock;
	}
}
