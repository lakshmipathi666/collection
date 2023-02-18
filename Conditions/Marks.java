package Conditions;

public class Marks {
	public static void main(String[] args) {
		int a=94;
		if (a>=91&&a<=100) {
			System.out.println("the Student score S grade");
		}
		else if(a>=81&&a<=90) {
			System.out.println("the Student score A grade");
		}
		else if(a>=71&&a<=80) {
			System.out.println("the Student score B grade");
		}
		else if(a>=50&&a<=70) {
			System.out.println("the Student score C grade");
		}
		else if(a>=35&&a<=50) {
			System.out.println("the Student score D grade");
		}
		else if (a>=0&&a<=35) {
			System.out.println("the Student is fail");
		}
		else  {
			System.out.println("it is not a mark");
		}
	}

}
