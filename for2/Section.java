package for2;

public class Section {
	public static void main(String[] args) {
		String [] name= {"muthu","lakshmi","sowmiya","santhos","raj kamal","vijay"};
		for(int i=0;i<name.length;i++) {
			if(name[i].charAt(0)>='a'&&name[i].charAt(0)<='h') {
				System.out.println(name[i]+" is 1st section");
			}
			else if(name[i].charAt(0)>='i'&&name[i].charAt(0)<='p') {
				System.out.println(name[i]+" is 2nd section");
			}
			else {
				System.out.println(name[i]+" is 3rd section");
			}
		}
	}

}
