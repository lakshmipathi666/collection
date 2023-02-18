package For3;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand="Samsung";
		lap1.color="white";
		lap1.price=35000;
		
		Laptop lap2=new Laptop();
		lap2.brand="lenovo";
		lap2.color="black";
		lap2.price=38000;

		Laptop lap3=new Laptop();
		lap3.brand="dell";
		lap3.color="grey";
		lap3.price=35000;
		
		Laptop lap4=new Laptop();
		lap4.brand="Hp";
		lap4.color="red";
		lap4.price=45000;
		
		Laptop lap5=new Laptop();
		lap5.brand="apple";
		lap5.color="yellow";
		lap5.price=30000;
		
		 Laptop[] laps = {lap1,lap2,lap3,lap4,lap5};
		 
//		 for(int i=0;i<laps.length;i++) {
//			 System.out.println(laps[i].brand+" "+laps[i].color+" "+laps[i].price);
//		 }
//		
//		for(int i=0;i<laps.length;i++) {
//			if(i%2!=0) {
//			System.out.println(laps[i].brand+" "+laps[i].color+" "+laps[i].price);
//			
//		 for(int i=0;i<laps.length;i++) {
//			 if(laps[i].brand.length()%2==0) {
//				 System.out.println(laps[i].brand+" "+laps[i].color+" "+laps[i].price);
//			}
//		}
//		int price=laps[0].price;
//		String brand=null;
//		String color=null;
//		for(int i=0;i<laps.length;i++) {
//			if(laps[i].price>=price) {
//				price=laps[i].price;
//				brand=laps[i].brand;
//				color=laps[i].color;
//			}
//		}
//		System.out.println(brand+" "+color+" "+price);
		
		int price=laps[0].price;
		Laptop x=null;
		for(int i=0;i<laps.length;i++) {
			if(laps[i].price<price) {
				price=laps[i].price;
				x=laps[i];
			}
		}
		System.out.println(x.price+" "+x.brand+" "+x.color);
				
			}
		
		
		
		
	

}
