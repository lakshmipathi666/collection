package revision2;

public class StringArray {
	public static void main(String[] args) {
		String [] a= {"Alkshmi","muthu","5avi","Pandi","pathi","Saran"};
		for(int i=0;i<a.length;i++) {
			String b=a[i].toUpperCase();
			if(b.charAt(0)>='A'&&b.charAt(0)<='H') {
				System.out.println(a[i]+" 1st Section");
			}
			else if(b.charAt(0)>='I'&&b.charAt(0)<='P') {
				System.out.println(a[i]+" 2nd Section");
			}
			else if(b.charAt(0)>='Q'&&b.charAt(0)<='Z') {
				System.out.println(a[i]+" 3rd Secction");
			}
			else {
				System.out.println("Not a Valid Entry");
			}
		}
	}

}
