package Day5;

public class AddArgs {
	public static void main(String [] args) {
		int num1=Integer.parseInt(args[0]);
		
		String[] split1=args[1].split(",");
		
		int num2=Integer.parseInt(split1[0]);
		
		int num3=Integer.parseInt(split1[1]);
		
		String[] split2=args[2].split(",");
		
		int num4=Integer.parseInt(split2[0]);
		
		int num5=Integer.parseInt(split2[1]);
		
		String[] split3=args[3].split(",");
		
		int num6=Integer.parseInt(split3[0]);
		
		int num7=Integer.parseInt(split3[1]);
		
		int total=num1+num2+num3+num4+num5+num6+num7;
		
		System.out.println("the total = "+total);
		
		
		
		
		
		
		
	}

}
