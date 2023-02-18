package Day3;

public class UseEmployee {
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.employeeId=9536;
		e1.employeeName="lakshmi";
		e1.dateOfBirth="11-10-1995";
		e1.mobileNo=9500690795l;
		String mobilenumE1=e1.countrycode+e1.mobileNo;
		
		
		Employee e2=new Employee();
		e2.employeeId=9556;
		e2.employeeName="muthu";
		e2.dateOfBirth="18-10-1995";
		e2.mobileNo=9500690565l;
		String mobilenumE2=e2.countrycode+e2.mobileNo;
		
		System.out.println("Employee1 details: "+"\n"+"Employee Id= "+e1.employeeId+"\n"+"dateOfBirth= "+e1.dateOfBirth+"\n"+"Mobile number= "+mobilenumE1);
		System.out.println("Employee2 details: "+"\n"+"Employee Id= "+e2.employeeId+"\n"+"dateOfBirth= "+e2.dateOfBirth+"\n"+"Mobile number= "+mobilenumE2);
		
	}

}
