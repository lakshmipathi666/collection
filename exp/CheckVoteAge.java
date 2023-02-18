package exp;

public class CheckVoteAge {
	public static void main(String[] args)throws Customexp {
		int age=100;
		
		System.out.println(age);
		
			if(age<18) {
				throw new Customexp("Not eligible");
			}
			else {
				System.out.println("eligible");
			}
			System.out.println(age+10);
		}
		
	}


