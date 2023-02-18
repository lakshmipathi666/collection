package for2;

public class PositiveNegative {
	public static void main(String[] args) {
		int[] num= {110,-115,35,62,0,-86,34,15,5};
		for(int i=0;i<num.length;i++) {
			if(num[i]>0) {
				System.out.println(num[i]+" is positive");
			}
			else if(num[i]<0) {
				System.out.println(num[i]+" is negative");
			}
			else {
				System.out.println(num[i]+" is neutral");
			}
		}
	}

}
