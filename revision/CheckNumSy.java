package revision;

public class CheckNumSy {
	public static void main(String[] args) {
		char a='L';
		if(a>'a'&&a<'z') {
			System.out.println("it is a lower case");
		}
		else if(a>'A'&&a<'Z') {
			System.out.println("it is a upper case");
			
		}
		else if(a>=0&&a<=9) {
			System.out.println("its a number");
		}
		else {
			System.out.println("its a symbol");
		}
	}

}
