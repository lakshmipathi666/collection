package forRev;

public class CubeOfOdd {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				if(i==7) {
					continue;
				}
				System.out.println("Cube of "+i+"="+ i*i*i);
			}
		}
	}

}
