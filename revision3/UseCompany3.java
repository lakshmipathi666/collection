package revision3;

public class UseCompany3 {
	
		public static void main(String[] args) {
			Employee3 e=new Employee3("lakshmi",5000,"developer",true);

			Company3 c3=new Company3("lakshmi groups",true,e);
			
		System.out.println(c3);
		
	}
	}
	class Employee3 {
		private String name;
		private int salary;
		private String designation;
		private boolean isPermanent;
		
		public Employee3(String name,int salary,String designation,boolean isPermanent) {
			this.name=name;
			this.salary=salary;
			this.designation=designation;
			this.isPermanent=isPermanent;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setSalary(int salary) {
			this.salary=salary;
		}
		public int getSalary() {
			return salary;
		}
		public void setDesignation(String designation) {
			this.designation=designation;
		}
		public String getDesignation() {
			return designation;
		}
		public void setIsPermanent(boolean isPermanent) {
			this.isPermanent=isPermanent;
		}
		public boolean getIsPermanent() {
			return isPermanent;
		}
		public String toString() {
			return "name:"+getName()+" "+"salary:"+getSalary()+"Designation:"+getDesignation()+"Is Permanent:"+getIsPermanent();
	}
	}
	class Company3{
		private String name;
		private boolean isPrivate;
		private Employee3 employee3;
		
		public Company3(String name,boolean isPrivate,Employee3 employee3) {
			this.name=name;
			this.isPrivate=isPrivate;
			this.employee3=employee3;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setIsPrivate(boolean isPrivate) {
			this.isPrivate=isPrivate;
		}
		public boolean getIsPrivate() {
			return isPrivate;
		}
		public void setEmployee1(Employee3 employee3) {
			this.employee3=employee3;
			
		}
		public Employee3 getEmployee3() {
			return employee3;
		}
		public String toString() {
			return "company name:"+getName()+" "+", Private Company:"+getIsPrivate()+" "+"Employee Details: "+getEmployee3();
		}
	}

