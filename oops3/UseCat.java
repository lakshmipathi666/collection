package oops3;

public class UseCat {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.sense();
		System.out.println(c.foodType("nonveg"));
		System.out.println(c.animalType(false));
		
	}
}

abstract class Animal {
	public abstract String foodType(String food);
	public void sense() {
		System.out.println("All animals are 5 Sensed");
		
	}
	public abstract String animalType(boolean isPet);
	
}

class Cat extends Animal {
	public String foodType(String food) {
		if(food.equalsIgnoreCase("veg")) {
			return "Herbivorous";
		}
		else if(food.equalsIgnoreCase("nonveg")) {
			return "carnivorous";
			
		}
		else {
			return "omnivorous";
		}
	}
	public String animalType(boolean isPet) {
		if(isPet==true) {
			return "Domestic animal";
		}
		else {
			return "wild animal";
		}
		
		}
	}
