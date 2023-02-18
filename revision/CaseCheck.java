package revision;

public class CaseCheck {
	public static void main(String[] args) {
		String a="Lakshmi";
		String b=a.toUpperCase();
		String c=a.toLowerCase();
		
		if (a.equals(b)) {
			System.out.println("All are in upper case");
		}
		else if(a.equals(c)) {
			System.out.println("all are in lower case");
		}
		else {
			System.out.println("combination of upper and lower case");
		}
	}

}
