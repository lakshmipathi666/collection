package for2;

public class MinString {
	public static void main(String[] args) {
		String [] name= {"muthu","lakshmi","sowmiya","santhos","raj kamal","vijay"};
		String min=name[0];
		for(int i=0;i<name.length;i++) {
			if(name[i].length()<min.length()) {
				min=name[i];
			}
		}
		System.out.println(min);
	}

}
