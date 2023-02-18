package function;

public class UseWeekDays {
	public static void main(String[] args) {
		WeekDays day=new WeekDays();
		day.findDay(2);
		
	}
}
class WeekDays {
	public  void findDay(int a) {
		switch(a){
			case 1:System.out.println("Sunday");
			break;
			case 2:System.out.println("monday");
			break;
			case 3:System.out.println("tuesday");
			break;
			case 4:System.out.println("wednesday");
			break;
			case 5:System.out.println("thursday");
			break;
			case 6:System.out.println("friday");
			break;
			case 7:System.out.println("Saturday");
			break;
			default:System.out.println("Invalid data");
		}
	
		
	}
}