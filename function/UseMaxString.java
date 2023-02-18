package function;

public class UseMaxString {
	public static void main(String[] args) {
		MaxString ms=new MaxString();
		String[] names= {"dol","puupy","lakshmi","muthu"};
		System.out.println(ms.findMaxString(names));
	}
}
class MaxString {
	public String findMaxString(String[] a) {
		String max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max=a[i];
			}
		}
		return max;
	}
}