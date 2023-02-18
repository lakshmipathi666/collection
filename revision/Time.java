package revision;

public class Time {
	public static void main(String[] args) {
		int a=5;
		if(a>=6&&a<=21) {
			System.out.println("working time");
		}
		else if(a>=0&&a<6||a>21&&a<=24) {
			System.out.println("Sleeping time");
			
		}
		else {
			System.out.println("its not a time");
		
		}
	}
}
