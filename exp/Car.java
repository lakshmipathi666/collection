package exp;

public class Car {
	String brand;
	public static void main(String[] args) throws BrandNotFound{
		String brand;
		Car c1=new Car();
		c1.brand="suzki";
		Car c2=new Car();
		c2.brand="honda";
		Car c3=new Car();
		c3.brand="yamaha";
		
		Car[] c= {c1,c2,c3};
		try {
			for(Car x:c) {
				if(x.brand=="yamaha"){
					System.out.println("found");
				}
				else {
					throw new BrandNotFound("not found");
				}
			}
		}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			
		}
	

}

