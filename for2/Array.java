package for2;

public class Array {
	public static void main(String[] args) {
		int [] numbers=new int[5];
		numbers[0]=100;
		numbers[1]=250;
		numbers[2]=350;
		numbers[3]=210;
		numbers[4]=115;
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		{		for(int i=numbers.length-1;i>=0;i--) {
			System.out.println(numbers[i]);
		}
		}
	}

}
