package revision2;

public class UseMaxString {
	public static void main(String[] args) {
		String[]a = {"aravi","muthu","pandi","ravi","lakshmipathi"};
		MaxString maximum=new MaxString();
		String max=maximum.findMaxString(a);
		System.out.println(max);
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