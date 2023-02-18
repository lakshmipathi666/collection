package revision2;

public class UseIntArray {
	public static void main(String[] args) {
		IntArray ar=new IntArray();
		int[] a= {10,20,30,40,50};
		int[] b=ar.addNumbers(a);
		for(int i:b) {
			System.out.println(i);
		}
		
	}
}
class IntArray{
	public int[] addNumbers(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+100;
		}
			return a;
			
		}
		
	}
