package oops2;

public class Home {
String brand;
int price;
int discount;
public Home(String brand,int b,int discount) {
	this.brand=brand;
	price=b;
	this.discount=discount;
}
	public String toString(){
		return "brand: "+brand+"price: "+price+"discount: "+discount;
		
	}
}


