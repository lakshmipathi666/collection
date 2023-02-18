package oops2;

public class Fridge extends Home {
String color;
boolean isDoubleDoor;
public Fridge(String brand,int b,int discount,String color,boolean isDoubleDoor) {
	super (brand,b,discount);
	this.color=color;
	this.isDoubleDoor=isDoubleDoor;
	
}
public String toString() {
	return super.toString()+"color: "+color+"is Doubledoor: "+isDoubleDoor;
	
}
}
