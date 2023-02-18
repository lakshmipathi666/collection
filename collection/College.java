package collection;

public class College {
	
		private String studentName;
		private boolean isMale;
		private int age;
		private String subject;
		
		public College(String studentName,boolean isMale,int age,String subject) {
			this.studentName=studentName;
			this.isMale=isMale;
			this.age=age;
			this.subject=subject;
		}
		
		public void setStudentName(String studentName){
			this.studentName=studentName;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setIsMale(boolean isMale){
			this.isMale=isMale;
		}
		public boolean getIsMale() {
			return isMale;
		}
		public void setAge(int age){
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void setSubject(String subject){
			this.subject=subject;
		}
		public String getSubject() {
			return subject;
		}
		public String toString() {
			return studentName+isMale+age+subject;
		}
	}

