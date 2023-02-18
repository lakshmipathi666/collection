package exp;

public class Arrayout {
	public static void main(String[] args) {
		String[] a= {"franklin","pechi","sjjsh"};
		try{
			for(int i=0;i<=10;i++) {
				System.out.println(a[i]);
			}
		}
		catch(ArithmeticException x ) {
			System.out.println(x);
		}
//		catch(IndexOutOfBoundsException y) {
//			y.printStackTrace();
//		}
//		catch(Exception b) {
//				b.printStackTrace();
//			}
		catch(Throwable j) {
			j.printStackTrace();
			
		}
			finally {
				System.out.println("ok");
			}
		}
	}


