package oops2;

public class PrivateBank extends Bank {
	int amount;
	String housingLoan;
	public int getInterest(int amount) {
		return (amount*10/100);
	}
	public String getHousingLoan(String housingLoan) {
		return "Yes";
	}
	public String toString() {
		return housingLoan;
	}
	
}
