package java8;

public class UseTravel {
	public String eiffeltower(String tour) {
		return tour;
	}
	public static void main(String[] args) {
		
	UseTravel n=new UseTravel();
	Travel m=n::eiffeltower;
	System.out.println(m.tajmahal("ma"));
	
}
}
