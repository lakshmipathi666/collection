package revision;

public class MiddelLetter {
	public static void main(String[] args) {
		String a="panidi";
		int b=a.length();
		if(b%2==0) {
			System.out.println(a.charAt((b/2)-1)+" "+a.charAt(b/2));
		}
		else {
			System.out.println(a.charAt(b/2));
		}
	}

}
//also
//
//canuse substring
//
//System.out.println(a.substring(a.length()/2-1),a.length/2+1)