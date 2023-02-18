package revision;

public class Last {
	public static void main(String[] args) {
		String a="vijay";
		String b=new String("vijay");
		if (a==b) {
			System.out.println("a and b are equal");
		}else {
			System.out.println("a and b are not equal");
		}
		if (a.equals(b)) {
			System.out.println("a and b are equal");
		}else {
			System.out.println("a and b are not equal");
		}
	}
}
