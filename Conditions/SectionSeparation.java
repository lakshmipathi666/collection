package Conditions;

public class SectionSeparation {
	public static void main(String[] args) {
		String a="Lakshmi";
		
		if (a.charAt(0)>='A'&&a.charAt(0)<='H') {
			System.out.println("The person is A section");
		}
		else if(a.charAt(0)>='I'&&a.charAt(0)<='P') {
			System.out.println("The person is B section");
		}
		else if(a.charAt(0)>='Q'&&a.charAt(0)<='Z') {
			System.out.println("The person is C section");
		}
	
	}

}
