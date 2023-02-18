package java8;

import java.util.Optional;

public class UseCarr {
	public static void main(String[] args) {
		Carr c=new Carr();
		c.brand=null;
		c.price=16489;
		c.color="Red";
		Optional<String>check=Optional.ofNullable(c.brand);
		if(check.isPresent()&&c.brand.equalsIgnoreCase("audi")){
			
			System.out.println("color is "+c.color+" price is "+c.price);
		}
		else {
			System.out.println("Out of Stock");
		}
		
	}
}
