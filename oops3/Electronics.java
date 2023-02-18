package oops3;

public abstract class Electronics {
	public void onOff(boolean isOn) {
		if(isOn==true) {
			System.out.println("it is Working");
			
		}
		else {
			System.out.println("it is not working");
		}
		
	}
	public abstract String Usage();
	
}
