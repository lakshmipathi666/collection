package for2;

public class MinNum {
	public static void main(String[] args) {
		int[] num= {110,-115,35,62,0,-86,34,15,5};
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
				
			}
		}
		System.out.println(min+" is min");
	}
}
