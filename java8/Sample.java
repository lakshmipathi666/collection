package java8;

public interface Sample {
	public static void findSample(String brand) {
		System.out.println("the brand is "+brand);
	}
	public default void findSample() {
		System.out.println("i am Lakshmi");
	}
}
