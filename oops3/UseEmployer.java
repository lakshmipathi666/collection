package oops3;

public class UseEmployer {
	public static void main(String[] args) {
		Employer e=new Employer();
		System.out.println(e.showSalary("hr"));
		System.out.println(e.showDesignation("hr"));
		System.out.println(e.permanentEmployee(true));
	}

}
