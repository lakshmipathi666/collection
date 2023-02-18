package functionMethods;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methodss {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>ab=(a,b)->a+b+1000;
		System.out.println(ab.apply(200,100));
		
		Consumer <Integer>ab1=x-> System.out.println(x+500);
		ab1.accept(500);
		
		Supplier<String>ab2=()->"Hello";
		System.out.println(ab2.get());
		
		Predicate<Integer>ab3=a->a>=100;
		System.out.println(ab3.test(50));
	}
}
