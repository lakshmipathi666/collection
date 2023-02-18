package oops2;

public class UseLoan {
	public static void main(String[] args) {
		Loan l=new Loan();
		System.out.println(l.loan());
		System.out.println(l.loan(50000));
		System.out.println(l.loan(50000, 500000));
	}
}
