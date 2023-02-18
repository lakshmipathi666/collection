package Conditions;

public class String3Minimum {
	public static void main(String[] args) {
		String a= "three";
		String b="wow";
		String c="tree";
		if(a.length()>b.length()&&a.length()>c.length()) {
			System.out.println(a+" is greater");
		}
		else if(b.length()>a.length()&&b.length()>c.length()) {
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}
	}

}
