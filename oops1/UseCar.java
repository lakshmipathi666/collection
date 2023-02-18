package oops1;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.setBrand("maruti");
		e.setPrice(10000);
		e.setModel("suv2013");
	
		Car c =new Car();
		c.setBrand("AUDI");
		c.setPrice(1000);
		c.setColor("black");
		c.setEngine(e);
		
		System.out.println(c.getBrand()+" "+c.getPrice()+" "+c.getColor()+" "+c.getEngine().getBrand()+" "+c.getEngine().getPrice()+" "+c.getEngine().getModel());
	}

}
