package Conditions;

public class Direction {
	public static void main(String[] args) {
		String a="north";
		switch(a) {
		case "South":System.out.println("It is South");
		break;
		case "north":System.out.println("It is North");
		break;
		case "east":System.out.println("It is East");
		break;
		case "west":System.out.println("It is west");
		break;
		default:System.out.println("it is not direction");
		}
	}

}
