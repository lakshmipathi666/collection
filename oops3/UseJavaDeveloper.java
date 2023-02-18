package oops3;

public class UseJavaDeveloper {
	public static void main(String[] args) {
		int time=10;
		JavaDeveloper d=new JavaDeveloper();
		System.out.println(d.eat(time));
		System.out.println(d.sleep());
		System.out.println(d.work());
		System.out.println(d.findSalary("hr"));
		System.out.println(d.fullStackDeveloper(true));
	}

}
interface Human {
	public String eat(int time);
	public String sleep();
	public String work();
	
}
abstract class ItEmployee implements Human {
	public abstract int findSalary(String designation);
	
}
class JavaDeveloper extends ItEmployee3 {
	public String eat(int time) {
		if(time>=7&&time<=10) {
			return "BreakFast Time";
		}
		else if(time>=12&&time<=15) {
			return "Lunch time";
		}
		else if(time>=19&&time<=22) {
			return "Dinner time";
		}
		else {
			return "Snacks Time";
		}
	}
	public String sleep() {
		return "Sleeps 8 hous a day";
	}
	public String work() {
		return "works 10 hours a day";
	}
	public int findSalary(String designation) {
		if(designation.equalsIgnoreCase("hr")) {
		return 75000;
		}
		
		else if(designation.equalsIgnoreCase("tl")) {
		return 50000;
		}
		else if (designation.equalsIgnoreCase("developer")) {
			return 35000;
		}
		else {
			return 25000;
		}
	}
	public String fullStackDeveloper(boolean isFrontEnd) {
		if(isFrontEnd==true) {
			return "fullStack Developer";
		}
		else {
			return "BackEnd developer";
		}
	}
		
	}
		
		
	
