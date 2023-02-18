package exp;

public class Characterko {
	
		public static void main(String[] args) {
			String a="anna";
			try {
				char b=a.charAt(10);
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
