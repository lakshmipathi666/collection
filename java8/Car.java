package java8;

public class Car implements Vehicle {
	public void findPrice(int price) {
		System.out.println("the price is"+price);
	}
	public String findBrand() {
		return "the brand is good";
	}
}
