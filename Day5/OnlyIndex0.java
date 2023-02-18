package Day5;

public class OnlyIndex0 {
	public static void main(String[]args) {
	String num=args[0];
	
	String[] numb=num.split(",");
	
	int num1=Integer.parseInt(numb[0]);
	int num2=Integer.parseInt(numb[1]);
	int num3=Integer.parseInt(numb[2]);
	int num4=Integer.parseInt(numb[3]);
	
	
	int total=num1+num2+num3+num4;
	
	System.out.println(total);
	
	}
	
}
