package oops3;

public class Employer implements Employee {
	public int showSalary (String designation) {
		if(designation.equalsIgnoreCase("hr")) {
			return 75000;
		}
		else if(designation.equalsIgnoreCase("tl")){
			return 55000;
		}
		else if(designation.equalsIgnoreCase("developer")) {
			return 35000;
		}
		else  {
			return 25000;
		}
	}
	public String showDesignation(String designation) {
		return "the Designation is "+designation;
	}
	public String permanentEmployee(boolean isPermanent) {
		if (isPermanent==true)
		return "IsPermanent";
		else {
			return "IS contrat";
		}
	}
	

}
