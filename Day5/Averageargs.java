package Day5;

public class Averageargs {
	public static void main(String []args) {
		int num1=Integer.parseInt(args[0]);
		
		String[] split1=args[1].split("#");
		
		int num2=Integer.parseInt(split1[0]);
		
		String[] split2=split1[1].split(",");
		
		int num3=Integer.parseInt(split2[0]);
		
		int num4=Integer.parseInt(split2[1]);
		
		int num5=Integer.parseInt(args[2]);
		
		int average=(num1+num2+num3+num4+num5)/5;
		
		
		System.out.println("the Average = "+average);
		
		
		
		
	}

}
