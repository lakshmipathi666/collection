package Day1;

public class Laptopdata {
	public static void main(String []args)
	{
		String brandName="Lenovo";
		int price=43500;
		int discount=20;
		int netPrice=price-(price*discount/100);
		int tax=20;
		int totalAmount=netPrice+(netPrice*20/100);
		
		String colour="Grey";
		String ram="2Gb";
		float rating=4.9f;
		boolean isTouch=true;
		String internalMemory="512Gb ssd";
//		System.out.println("Brand Name= "+brandName);
//		System.out.println("Price= "+price);
//		System.out.println("Colur= "+colour);
//		System.out.println("Ram= "+ram);
//		System.out.println("Rating= "+rating);
//		System.out.println("Is Touch= "+isTouch);
		System.out.println("Brand Name= "+brandName+"\nPrice= "+price+"\nColur= "+colour+"\nRam= "+ram+"\nRating= "+rating+"\nIstouch= "+isTouch+"\nInternal Memory= "+internalMemory);
		System.out.println("the net price= "+netPrice);
//		System.out.println("the total price= "+totalAmount);
		System.out.println("the total price= "+totalAmount);
		
		
	}

}
