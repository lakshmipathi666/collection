package java8;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.findPrice(50000);
		System.out.println(c.findBrand());
		Vehicle.findBrand(" ferrari");
	}
}
