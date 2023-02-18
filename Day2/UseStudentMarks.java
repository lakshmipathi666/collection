package Day2;

import java.util.concurrent.atomic.AtomicStampedReference;

public class UseStudentMarks {
	public static void main(String[]args) {
		StudentMarks student1=new StudentMarks();
		student1.name="Lakshmi";
		student1.age=27;
		student1.tamil=80;
		student1.english=90;
		student1.maths=75;
		student1.total = student1.tamil+student1.english+student1.maths;
		student1.average=student1.total/3;
		
		
		
		StudentMarks student2=new StudentMarks();
		student2.name="Muthu";
		student2.age=26;
		student2.tamil=85;
		student2.english=77;
		student2.maths=99;
		student2.total = student2.tamil+student2.english+student2.maths;
		student2.average=student2.total/3;
		
		StudentMarks student3=new StudentMarks();
		student3.name="Ravi";
		student3.age=26;
		student3.tamil=90;
		student3.english=90;
		student3.maths=95;
		student3.total = student3.tamil+student3.english+student3.maths;
		student3.average=student3.total/3;
				
		int overallTotal=student1.total+student2.total+student3.total;
		
		
		System.out.println("Student1 mark= "+student1.total+"\n"+"student2 marks= "+student2.total+"\n"+"student3 marks= "+student3.total);
		System.out.println("overall total marks= "+overallTotal);
		System.out.println("average of student 1= "+student1.average+"\n"+"average of student 2= "+student2.average+"\n"+"average of student 3= "+student3.average);
		
	}
}
