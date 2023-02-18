package exp;

public class NumberFormatExp {
	public static void main(String[] args) {
		String a="anna";
		try {
			int b=Integer.parseInt(a);
			System.out.println(b);
		
		}
		catch(Exception c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("invalid");
		}
	}
	}

