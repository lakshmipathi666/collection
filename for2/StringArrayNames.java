package for2;

public class StringArrayNames {
	public static void main(String[] args) {
		String [] name= {"muthu","lakshmi","sowmiya","santhos","raj kamal","vijay"};
		System.out.println("Forward");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		for(int i=name.length-1;i>=0;i--){
		System.out.println(name[i]);	
		}
	}
}
