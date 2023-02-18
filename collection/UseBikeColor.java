package collection;

import java.util.ArrayList;

public class UseBikeColor {
	public static void main(String[] args) {
		Bike b1=new Bike("honda",15000,"Red",true);
		Bike b2=new Bike("TVS",164000,"Whitee",false);
		Bike b3=new Bike("BMW",16000,"Grey",true);
		Bike b4=new Bike("Yamaha",16497,"Black",false);
		Bike b5=new Bike("bajaj",164541,"blue",true);
		ArrayList<Bike>bikes=new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		bikes.add(b5);
		
		int max=0;
		Bike temp=null;
		for(Bike b:bikes) {
			if(b.getColor().length()>=max) {
				max=b.getColor().length();
				temp=b;
			}
			
		}
		//System.out.println(temp);
		
//		int max1=0;
//		String temp1="";
//		for(Bike c:bikes) {
//			if(c.getBrand().length()>=max) {
//				max=c.getBrand().length();
//				temp1=c.getBrand();
//			}
	
			Bike temp1=bikes.get(0);
			for(Bike h:bikes) {
				if(h.getColor().length()>=temp1.getColor().length()) {
					temp1=h;
				}
			}
			

		System.out.println(temp1.getIsAutomatic());
		
		
		
//		String max=b1.getColor();
//		for(int i=0;i<bikes.size();i++) {
//			if(bikes.get(i).getColor().length()>max.length()) {
//				max=bikes.get(i);
//				System.out.println(bikes.get(i));
//			}
//		}
}
}
