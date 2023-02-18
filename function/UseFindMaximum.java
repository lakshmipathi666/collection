package function;

public class UseFindMaximum {
	public static void main(String[] args) {
		FindMaximum fm= new FindMaximum();
		System.out.println("the maximum num is "+fm.findMaxNum());
	}

}
class FindMaximum {
	public int findMaxNum() {
		int a=2;
		int b=5;
		int c=6;
	
		if(a>b&&a>c) {
			return a;
		}
			else if(b>a&&b>c) {
				return b;
			}
			else {
				return c;
			
		}
	}
	
}