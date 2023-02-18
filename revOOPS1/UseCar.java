package revOOPS1;

public class UseCar {
	public static void main(String[] args) {
		Door d=new Door();
		d.brand="godrej";
		d.model="IND007";
		d.stock=17;
		
		
		Car c=new Car();
		c.brand="Hyundai";
		c.color="Red";
		c.price=1500000;
		c.door=d;
		
		System.out.println(c.brand+" "+c.color+" "+c.price+" "+c.door.brand+" "+c.door.model+" "+c.door.stock);
		
	}
}
class Car {
	String brand;
	String color;
	int price;
	Door door;
}
class Door {
	String brand;
	String model;
	int stock;
	
}