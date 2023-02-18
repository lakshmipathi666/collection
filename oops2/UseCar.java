package oops2;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="hyundai";
		c.color="red";
		c.setPrice(160000);
		c.setTax(15000);
		
		Vehicle v=new Vehicle();
		v.color="white";
		v.brand="maruti";
		v.setPrice(120000);
		v.setTax(15000);
		
		Vehicle vc=new Car();
		
		
		System.out.println(c);
		
	}
}
