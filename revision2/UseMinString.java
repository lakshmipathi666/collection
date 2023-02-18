package revision2;

public class UseMinString {
	public static void main(String[] args) {
		String[]a = {"aravi","muthu","pandi","rai","lakshmipathi"};
		MinString minimum=new MinString();
		String min=minimum.findMinString(a);
		System.out.println(min);
	}
}
class MinString {
public String findMinString(String[] a) {
	String min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i].length()<min.length()) {
			min=a[i];
			
		}
	}
	return min;
}
}

