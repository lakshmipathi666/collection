package java8;

public class UseCalculator  {
	
		
		public static void main(String[] args) {
			//Calculator1 c=new Calculator1();
			Calculator c=(a,b)->a+b;
			System.out.println(c.maths(2, 2));
			Calculator.printOperation("Addition");
			c.activity();
		}
	}

