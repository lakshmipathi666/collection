package oops2;

public class Bank {
	int amount;
	String loanEligibility;
	int interest;
	public int getInterest(int amount) {
		return (amount*5/100);
	}
	public String getLoanELigibility(String loanEligibility) {
		return "Gov Job";
	}
	public String toString() {
		return loanEligibility;
	}
}
