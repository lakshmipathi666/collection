package oops3;

public class UseTamilNaduGovernment {
	public static void main(String[] args) {
		String state="tamilnadu";
		int number=7541;
		TamilNaduGovernment t=new TamilNaduGovernment();
		System.out.println(t.displayPlateType());
		System.out.println(t.displayCode());
		System.out.println(t.displayStateCode(state));
		System.out.println(t.displayVehicleNumber(number));
	}
}
interface NumberPlateRules {
	public String displayPlateType();
	public String displayCode(String country);
	
}
abstract class CentralGovernment implements NumberPlateRules{
	public abstract String displayStateCode(String state);
	public String displayPlateType() {
		return "horizontal";
	}
	public String displayCode() {
		return "IND";
	}
}
class TamilNaduGovernment extends CentralGovernment {
	public String displayStateCode(String state) {
		return "the code of tmilnadu is TN";
	}
	public String displayVehicleNumber(int number) {
		return "the vehicle number is 7541";
		
	}
	
	
}
