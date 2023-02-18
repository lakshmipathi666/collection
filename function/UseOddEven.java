package function;

public class UseOddEven {
	public static void main(String[] args) {
	OddEven o= new OddEven();
	System.out.println(o.findOddOrEven(5));
	}
}
class  OddEven {
	public String findOddOrEven(int a) {
		if(a%2==0) {
			return "even";
		}
		else {
			return "odd";
			
		}
	}
	
}
