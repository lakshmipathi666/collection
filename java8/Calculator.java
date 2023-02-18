package java8;

public interface Calculator {
	public int maths(int a,int b);
	
	public static void printOperation(String a) {
		System.out.println(a+" is a Operation");
	}
	public default void activity() {
		System.out.println("this is CAlculator interface");
	}
}
