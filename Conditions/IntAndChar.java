package Conditions;

public class IntAndChar {
	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		char operation='*';
		switch(operation) {
		case '+':System.out.println(num1+num2);
		break;
		case '-':System.out.println(num1-num2);
		break;
		case '*':System.out.println(num1*num2);
		break;
		case '/':System.out.println(num1/num2);
		break;
		default:System.out.println("it is not an arithmatic operator");
		}
	}

}
