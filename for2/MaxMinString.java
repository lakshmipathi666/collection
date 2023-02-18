package for2;

public class MaxMinString {
	public static void main(String[] args) {
		String [] name= {"muthu","lakshmi","sowmiya","santhos","raj kamal","vijay"};
		String max=name[0];
		
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>=max.length()) {
				max=name[i];
			}
			
		}
		System.out.println(max);
	}

}
