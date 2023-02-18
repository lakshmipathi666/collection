package for2;

public class AddValue {
	public static void main(String[] args) {
		int[] num= {110,-115,35,62,0,-86,34,15,5};
		int temp=0;
		int count=0;
		for(int i=0;i<num.length;i++) {
			temp=temp+num[i];
			count++;
		}
		System.out.println(temp/count);
		
	}

}
