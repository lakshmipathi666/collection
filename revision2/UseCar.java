package revision2;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.manufacturer="Honda";
		car1.isImported=true;
		car1.price=500000;
		car1.taxPercent=10;
		car1.disPercent=10;
		car1.netPrice=car1.findNetPrice(car1.price,car1.taxPercent,car1.disPercent);
		
		Car car2=new Car();
		car2.manufacturer="Ferrai";
		car2.isImported=true;
		car2.price=1000000;
		car2.taxPercent=20;
		car2.disPercent=10;
		car2.netPrice=car1.findNetPrice(car2.price,car2.taxPercent,car2.disPercent);
		
		Car car3=new Car();
		car3.manufacturer="Maruti";
		car3.isImported=false;
		car3.price=200000;
		car3.taxPercent=20;
		car3.disPercent=10;
		car3.netPrice=car3.findNetPrice(car3.price,car3.taxPercent,car3.disPercent);
		
		Car[] cars= {car1,car2,car3};
		
		Car max=car1.findMaxPrice(cars);
		System.out.println(max.manufacturer+" "+ max.isImported+" " + max.netPrice);
		
		
		
	}

}
class Car {
	String manufacturer;
	boolean isImported;
	int price;
	int taxPercent;
	int disPercent;
	int netPrice;
	
	public int findNetPrice(int price, int taxPercent, int disPercent) {
		int disAmount=price/disPercent;
		int mrp=price-disAmount;
		int tax=mrp/taxPercent;
		int netPrice=mrp+tax;
		return netPrice;
	}
	public Car findMaxPrice(Car[] a) {
		Car max=a[0];
		for(Car c:a) {
			if(c.netPrice>max.netPrice) {
				max=c;
			}
		}
		return max;
	}
}
