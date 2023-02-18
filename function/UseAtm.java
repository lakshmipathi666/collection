package function;

public class UseAtm {
	public static void main(String[] args) {
		Atm atm1=new Atm();
		atm1.bankname="cub";
		atm1.location="chennai";
		atm1.mainBalance=50000;
		atm1.depositAmt=1000;
		
		System.out.println("the bank name is "+atm1.bankname);
		System.out.println(atm1.findCredit(atm1.mainBalance, atm1.depositAmt));
		System.out.println(atm1.findDebit(atm1.mainBalance, atm1.depositAmt));
		
		Atm atm2=new Atm();
		atm2.bankname="canara";
		atm2.location="chennai";
		atm2.mainBalance=60000;
		atm2.depositAmt=10000;
		
		System.out.println("the bank name is "+atm2.bankname);
		System.out.println(atm2.findCredit(atm2.mainBalance, atm2.depositAmt));
		System.out.println(atm2.findDebit(atm2.mainBalance, atm2.depositAmt));
	}

}
class Atm{
	String bankname;
	String location;
	int mainBalance;
	int depositAmt;
	
	public String findCredit(int a , int b) {
		return "the credit is "+(a+b);
	}
	public String findDebit(int a, int b) {
		return "the debit is "+(a-b);
	}
		
	}


