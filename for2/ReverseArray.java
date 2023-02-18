package for2;

public class ReverseArray {
	public static void main(String[] args) {
		String [] name= {"muthu","lakshmi","sowmiya","santhos","rajkamal","vijay"};
		String temp="";
		for(int i=name.length-1;i>=0;i--) {
			temp=temp+name[i]+",";
		}
		System.out.println(temp);
	}

}
