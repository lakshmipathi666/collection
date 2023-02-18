package oops3;

public class Chair implements Furniture {
	public void materialType() {
		System.out.println("The Material Type is wood");
	}
	public void lifeTime(String material) {
		if(material.equalsIgnoreCase("wood")){
			System.out.println("Long life");
		}
		else{
			System.out.println("Short Life Span");	
		}
	}
	public void furnitureName() {
		System.out.println("the Furniture is chair");
	}
	
}
