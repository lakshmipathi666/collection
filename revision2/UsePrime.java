package revision2;

public class UsePrime {
	public static void main(String[] args) {
		Prime prime=new Prime();
		
		System.out.println(prime.findPrime(49));
	}
}


class Prime {
	public String findPrime(int a) {
	
	boolean temp=true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			temp=false;
			
		}
	}
	if(temp==true) {
		return "Its a prime";
		
	}else {
		return "Its not a prime";
	}
	}
	
	
}