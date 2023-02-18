package function;

public class UseStudentMarks {
	public static void main(String[] args) {
		StudentMarks student=new StudentMarks();
		student.displayMarks(10,20,30,40,50);
		student.findTotal(10,20,30,40,50);
		student.findAverage(10,20,30,40,50);
		
		
	}

}

class StudentMarks {
	public void displayMarks(int tamil, int english, int maths, int science, int social) {
		System.out.println("Tamil="+tamil+",English="+english+",maths="+maths+",science="+science+",social="+social);
	}
	public void findTotal(int tamil, int english, int maths, int science, int social) {
		System.out.println(tamil+english+maths+science+social);
	}
	public void findAverage(int tamil, int english, int maths, int science, int social) {
		System.out.println((tamil+english+maths+science+social)/5);
	}
}
