package revision;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="kavi";
		student1.age=10;
		student1.std="5th";
		student1.isNCC=true;
		
		Student student2=new Student();
		student2.name="pandi";
		student2.age=15;
		student2.std="10th";
		student2.isNCC=true;
		
		Student student3=new Student();
		student3.name="kumar";
		student3.age=12;
		student3.std="8th";
		student3.isNCC=false;
		
		if (student1.name.contains("a")||student1.name.contains("e")) {
			System.out.println(student1.name);
		}
		else {
			System.out.println("the name doesnot cantain a or e");
				
			}
		
		if(student1.age>student2.age&&student1.age>student3.age){
			System.out.println("student1 had highest age");
		}
		else if (student2.age>student1.age&&student2.age>student3.age) {
			System.out.println("student2 had highest age");
		}
		else {
			System.out.println("student3 had highest age");
		}
	}
		}
