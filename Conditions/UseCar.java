package Conditions;
import Day2.Car;
public class UseCar {
public static void main(String[] args) {
	Car c2=new Car();
	c2.brand="honda";
	c2.price=7800;
	c2.colour="blue";
	Car c3=new Car();
	c3.brand="hyundai";
	c3.price=84255;
	c3.colour="red";
	Car c4=new Car();
	c4.brand="maruti";
	c4.price=4855009;
	c4.colour="white";
	
	if (c2.price>=c3.price&&c2.price>=c4.price) {
		System.out.println(c2.brand+" "+c2.price);
	}
	
		else if (c3.price>=c2.price&&c3.price>=c4.price) {
			System.out.println(c3.brand+" "+c3.price);
			
		}
		else {
			System.out.println(c4.brand+" "+c4.price);
		}
	
	}
}
