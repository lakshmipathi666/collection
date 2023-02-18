package Day2;

public class UseCar {
	public static void main(String[]args) {
		Car c1=new Car();
		c1.brand="ferrai";
		c1.price=10000;
		c1.colour="red";
		c1.rating=4.9f;
		c1.isLuxurious=true;
		c1.fuelType="petrol";
		c1.discount=10;
		c1.netPrice=c1.price-(c1.price*10/100);
		
		Car c2=new Car();
		c2.brand="bently";
		c2.price=80000;
		c2.colour="red";
		c2.rating=4.9f;
		c2.isLuxurious=true;
		c2.fuelType="petrol";
		c2.discount=30;
		c2.netPrice=c2.price-(c2.price*30/100);
		
		Car c3=new Car();
		c3.brand="lambogini";
		c3.price=70000;
		c3.colour="red";
		c3.rating=4.9f;
		c3.isLuxurious=true;
		c3.fuelType="petrol";
		c3.discount=20;
		c3.netPrice=c3.price-(c3.price*20/100);
		
		System.out.println("Brand= "+c1.brand+"\n"+"price= "+c1.price+"\n"+"Colour=  "+c1.colour+"\n"+"Rating=  "+c1.rating+"\n"+c1.isLuxurious+"\n"+c1.fuelType+"\n"+c1.discount+"\n"+c1.netPrice);
		System.out.println("Brand= "+c2.brand+"\n"+"price= "+c2.price+"\n"+"Colour=  "+c2.colour+"\n"+"Rating=  "+c2.rating+"\n"+c2.isLuxurious+"\n"+c2.fuelType+"\n"+c2.discount+"\n"+c2.netPrice);
		System.out.println("Brand= "+c3.brand+"\n"+"price= "+c3.price+"\n"+"Colour=  "+c3.colour+"\n"+"Rating=  "+c3.rating+"\n"+c3.isLuxurious+"\n"+c3.fuelType+"\n"+c3.discount+"\n"+c3.netPrice);
		
		
	}

}
