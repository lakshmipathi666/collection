package revision3;

public class UseCompany {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="lakshmi";
		e.salary=100000;
		e.designation="developer";
		e.isPermanent=true;
		
		Company c=new Company();
		c.name="Lakshmi";
		c.isPrivate=true;
		c.employee=e;
		System.out.println(c.name+" "+c.isPrivate+" "+c.employee.name+" "+c.employee.salary+" "+c.employee.designation+" "+c.employee.isPermanent);
	
	
}
}
class Employee {
	String name;
	int salary;
	String designation;
	boolean isPermanent;
}
class Company{
	String name;
	boolean isPrivate;
	Employee employee;
}