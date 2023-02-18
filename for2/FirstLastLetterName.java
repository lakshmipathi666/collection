package for2;

public class FirstLastLetterName {
	public static void main(String[] args) {
		String [] name= {"muthu","lakshmi","sowmiya","santhos","raj kamal","vijay"};
		
		for(int i=0;i<name.length;i++) {
			
			System.out.println("first:"+name[i].charAt(0)+"\n"+"last:"+name[i].charAt(name[i].length()-1));
		}
	}

}
