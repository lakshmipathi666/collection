package oops2;

public class UsePrivateBank {
	public static void main(String[] args) {
		PrivateBank pb=new PrivateBank();
		
		
		Bank b=new Bank();
	
		
		Bank bs=new PrivateBank();
		
		
		System.out.println(pb.getInterest(10000));
		System.out.println(b.getInterest(10000));
		System.out.println(bs.getLoanELigibility("gov job"));
		
	}
}
