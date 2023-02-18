package revision2;

public class Palindrome {
	public static void main(String[] args) {
		String a="Level";
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		if(a.equalsIgnoreCase(temp)) {
			System.out.println("yes it is palindrome");
		}
		else {
			System.out.println("No it is not palindrome");
		}
	}

}
