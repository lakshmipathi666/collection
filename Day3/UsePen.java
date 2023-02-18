package Day3;

public class UsePen {
	public static void main(String[]args) {
		Pen p1=new Pen();
		p1.brand="camlin";
		p1.price=49;
		p1.isBlueColour=true;
		p1.tipWidth=2.2f;
		
		Pen p2=new Pen();
		p2.brand="parker";
		p2.price=51;
		p2.isBlueColour=false;
		p2.tipWidth=2.4f;
		
		Pen p3=new Pen();
		p3.brand="faber-castel";
		p3.price=52;
		p3.isBlueColour=true;
		p3.tipWidth=2.1f;
		
		int averagePrice=(p1.price+p2.price+p3.price)/3;
		
		System.out.println("The Average price of the pen= "+averagePrice);
		
		
		
	}
}
