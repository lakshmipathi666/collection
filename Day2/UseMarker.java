package Day2;

public class UseMarker {
	public static void main(String[]args) {
	Marker m=new Marker();
	m.brand="faber castel";
	m.colour="black";
	m.price=30;
	m.shape="cylinderical";
	m.isrefill=false;
	
	Marker m1=new Marker();
	m1.brand="camlin";
	m1.colour="red";
	m1.price=50;
	m1.shape="cylindrical";
	m1.isrefill=true;
	
	Marker m2=new Marker();
	m2.brand="reynolds";
	m2.colour="violet";
	m2.price=40;
	m2.shape="rectangle";
	m2.isrefill=true;
	
	Marker m3= new Marker();
	m3.brand="roreto";
	m3.colour="green";
	m3.price=45;
	m3.shape="cylinder";
	m3.isrefill=false;
	
	
	System.out.println(m.brand+"\n"+m.colour+"\n"+m.price+"\n"+m.shape+"\n"+m.isrefill);
	System.out.println(m1.brand+"\n"+m1.colour+"\n"+m1.price+"\n"+m1.shape+"\n"+m1.isrefill);
	System.out.println(m2.brand+"\n"+m2.colour+"\n"+m2.price+"\n"+m2.shape+"\n"+m2.isrefill);
	System.out.println(m3.brand+"\n"+m3.colour+"\n"+m3.price+"\n"+m3.shape+"\n"+m3.isrefill);

	
	
	}

}
