package Day4;

public class UsePen {
	public static void main(String[]args) {
		Pen pen1=new Pen();
		pen1.brand="reynolds";
		pen1.price=5;
		pen1.color="blue";
		
		Pen pen2=new Pen();
		pen2.brand="parker";
		pen2.price=25;
		pen2.color="black";
		
		String upperCase1=pen1.brand.toUpperCase();
		String upperCase2=pen2.brand.toUpperCase();
		
		boolean containspen1=pen1.brand.contains("r");
		boolean checkpen1=pen1.color.equals("BLUE");
		boolean checkpen2=pen2.color.equals("black");
		
		char charAt4=pen2.color.charAt(4);
		char charAt2=pen1.color.charAt(2);
		
		String[] split=pen1.brand.split("n");
		
		int length1=pen1.color.length();
		int length2=pen2.color.length();
		
		System.out.println(upperCase1+"\n"+upperCase2+"\n"+containspen1+"\n"+checkpen1+"\n"+checkpen2+"\n"+charAt4+"\n"+charAt2+"\n"+split+"\n"+length1+"\n"+length2);
		
		
		
		
		
		
	}

}
