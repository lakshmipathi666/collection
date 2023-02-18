package oops3;

public class EngineeringCourse implements Course{
	public String printCourse(String course) {
		return "the course is "+course;
	}
	public int findFees(String course) {
		if(course.equalsIgnoreCase("be")||course.equalsIgnoreCase("btech")) {
			return 150000;
		}
		else if(course.equalsIgnoreCase("medical")) {
			return 300000;
		}
		else {
			return 50000;
		}
	}
	public String printDuration(String degree) {
		if(degree.equalsIgnoreCase("be")||degree.equalsIgnoreCase("btech")) {
			return "4 years";
		}
		else if(degree.equalsIgnoreCase("mbbs")) {
			return "5 years";
		}
		else if(degree.equalsIgnoreCase("diplomo")) {
			return "1 year";
		}
		else {
			return "3 years";
		}
	}

}
