package Conditions;

public class Rating {
	public static void main(String[] args) {
		int a=8;
		if (a>=0&&a<=5) {
			System.out.println("the movie is bad");
		}
		else if(a>=6&&a<=7.5){
			System.out.println("the movie is average");
		}
		else if(a>=7.5&&a<=10) {
			System.out.println("the movie is good");
		}
		else {
			System.out.println("Its not a valid rating");
		}
	}
}
