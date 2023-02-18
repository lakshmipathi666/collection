package Day5;

public class UseBeanClassUsingArgs {
	public static void main(String[]args) {
		BeanClassUsingArgs car=new BeanClassUsingArgs();
		
		car.brand=args[0];
		car.price=Integer.parseInt(args[1]);
		car.model=args[2];
		car.color=args[3];
		
		String s1=args[4];
		String[] a1=s1.split(",");
		
		BeanClassUsingArgs car2=new BeanClassUsingArgs();
		
		car2.brand=a1[0];
		car2.price=Integer.parseInt(a1[1]);
		car2.model=a1[2];
		car2.color=a1[3];
		
		
		
		
		
		System.out.println(car.brand+car.price+car.model+car.color);
		System.out.println(car2.brand+"\n"+car2.price+car2.model+car2.color);
	}

}
