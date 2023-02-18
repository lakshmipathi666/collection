package java8;

import java.util.Optional;

public class OptiClass {
	public static void main(String[] args) {
		String a="RaJ";
		Optional<String>check=Optional.ofNullable(a);
//		if(check.isPresent()) {
//			System.out.println(a.toUpperCase());
//		}else {
//			System.out.println("Out of Stock");
//		}
		System.out.println(check.orElse("Not Available"));
	}
}
