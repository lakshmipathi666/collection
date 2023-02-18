package for2;

public class MaxNum {
	public static void main(String[] args) {
		int[] num= {110,-115,35,621,0,-86,34,15,5};
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			
			}
		System.out.println(max+" is max num ");
		}
	}

