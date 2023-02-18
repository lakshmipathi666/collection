package Conditions;

public class StringCheck {
	public static void main(String[] args) {
		String a="legend";
		if(a.equals(a.toUpperCase())) {
			System.out.println(a+" is in uppercase");
		}
		else if(a.equals(a.toLowerCase())) {
			System.out.println(a+" is in lowercase");
		}
		else {
			System.out.println(a+" is combination of upper and lower case");
		}
	}

}
