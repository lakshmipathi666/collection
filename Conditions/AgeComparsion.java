package Conditions;

public class AgeComparsion {
	public static void main(String[] args) {
		int age=60;
		if (age>=0&&age<=12) {
			System.out.println("the person is kid");
		}
		else if (age>12&&age<=19) {
			System.out.println("the person is a teenager");
		}
		else if(age>19&&age<=45) {
			System.out.println("the person is a adult");
		}
		else if(age>45) {
			System.out.println("the person is a senior citizen");
		}
		else {
			System.out.println("the value is not age");
		}
	}

}
