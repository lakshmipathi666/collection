package oops2;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("String "+ c.add("laks", "muth"));
		System.out.println(c.add(10, 2));
		System.out.println(c.add(10, 10, 10));
	}
}
