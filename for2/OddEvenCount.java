package for2;

public class OddEvenCount {
	public static void main(String[] args) {
		int[] num= {110,-115,35,62,0,-86,34,15,5};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			}
		System.out.println("even count is"+evenCount);
		System.out.println("odd count is"+oddCount);
		}

}
