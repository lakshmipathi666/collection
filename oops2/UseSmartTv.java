package oops2;

public class UseSmartTv {
	public static void main(String[] args) {
		Tv t=new Tv();
		t.brand="acer";
		t.price=1000;
		
		SmartTv s=new SmartTv();
		s.brand="l.g";
		s.price=50000;
		s.brand="samsung";
		s.color="red";
		s.isSmartTv=true;
		System.out.println(s.brand+" "+s.price+s.color+s.isSmartTv);
		System.out.println(s.findLength(s.brand));
		System.out.println(t.brand+t.price);
		
	}
}
