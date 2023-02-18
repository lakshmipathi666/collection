package exp;

public class StringNull {
	public static void main(String[] args) {
		String c=null;
		try {
			int a=c.length();
			
			System.out.println(a);
		}
		catch(Exception a) {
			a.printStackTrace();
		}
		finally {
			System.out.println("Invalid data");
		}
	}
}
