package java8;

public class StaticAndFinal {
	
	static int value=0;
//	final int value=10;
	public StaticAndFinal() {
		value++;
		System.out.println(value);
	}
}
