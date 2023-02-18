package exp;

public class FindArithmaticExp {
	public static void main(String[] args) {
		String c=null;
		try {
			int a=10;
			int b=0;
			int div=a/b;
			System.out.println(div);
		}
		catch(Exception a) {
			a.printStackTrace();
		}
		finally {
			System.out.println("Invalid data");
		}
	}
}
