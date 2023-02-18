package oops2;

public class Loan {
	public int loan() {
		return 30000;
	}
	public int loan(int a) {
		return (a*10)+30000;
	}
	public int loan(int a, int b) {
		return (a*10)+30000+(b/4);
	}
}
