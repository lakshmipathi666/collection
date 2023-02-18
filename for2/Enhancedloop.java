package for2;

public class Enhancedloop {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,55,60};
		int total=0;
		for(int i:a) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}
			else {
				System.out.println(i+" is odd");
			}
		}
	}
}
