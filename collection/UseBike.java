package collection;

import java.util.ArrayList;

public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike("honda",15000,"Red",true);
		Bike b2=new Bike("TVS",164000,"White",false);
		Bike b3=new Bike("BMW",16000,"Grey",true);
		Bike b4=new Bike("Yamaha",16497,"Black",false);
		Bike b5=new Bike("bajaj",164541,"blue",true);
		ArrayList<Bike>bikes=new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		bikes.add(b5);
		bikes.forEach(x->{if(x.getPrice()>15000) {
			int taxAmount=(x.getPrice()*5)/100;
			int netPrice=x.getPrice()+taxAmount;
			System.out.println(x.getBrand()+netPrice);
		}
		});
		
//		for(Bike x:bikes) {
//			System.out.println(x);
		}
	}

