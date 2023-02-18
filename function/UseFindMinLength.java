package function;

public class UseFindMinLength {
	public static void main(String[] args) {
		FindMinLength fm=new FindMinLength();
		fm.findMinLength();
	}
}
class FindMinLength {
	public void findMinLength() {
		String[] a= {"dol","puupy","lakshmi","muthu"};
		String min=a[0];
		for(int i=a.length-1;i>=0;i--) {
			if(a[i].length()<min.length()) {
				min=a[i];
				
			}
		}
		System.out.println("the min string is "+min);
		
	}
}