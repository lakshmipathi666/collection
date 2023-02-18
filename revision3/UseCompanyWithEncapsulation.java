package revision3;

public class UseCompanyWithEncapsulation {
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.setName("lakshmi");
		e.setSalary(100000);
		e.setDesignation("developer");
		e.setIsPermanent(true);
		
		CompanyWithEncapsulation c=new CompanyWithEncapsulation();
		c.setName("Lakshmi");
		c.setIsPrivate(true);
		c.setEmployee1(e);
		System.out.println(c.getName()+" "+c.getIsPrivate()+" "+c.getEmployee1().getName()+" "+c.getEmployee1().getSalary()+" "+c.getEmployee1().getDesignation()+" "+c.getEmployee1().getIsPermanent());
	
	
}
}
class Employee1 {
	private String name;
	private int salary;
	private String designation;
	private boolean isPermanent;
	
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
}
class CompanyWithEncapsulation{
	private String name;
	private boolean isPrivate;
	private Employee1 employee1;
	
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
	public void setEmployee1(Employee1 employee1) {
		this.employee1=employee1;
		
	}
	public Employee1 getEmployee1() {
		return employee1;
	}
}