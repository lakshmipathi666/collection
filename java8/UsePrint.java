package java8;

public class UsePrint {
	public static void main(String[] args) {
		Print c=(a,b)->{if(a.startsWith("l")) {return "price is "+b;}else {return "Invalid";}};
		System.out.println(c.findPrintPrice("lakshmi",1000));
	}
}
