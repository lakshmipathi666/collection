package forRev;

public class PrimeNum13 {
public static void main(String[] args) {
	int num=1000;
	for (int i=2;i<=num;i++) {
		if(i%i==0) {
			System.out.println(i);
		}
	}
}
}
