package oops1;

public class UseMarker {
	public static void main(String[] args) {
		Refill r=new Refill();
		r.brand="camlin";
		r.price=10;
		r.color="black";
		
		Marker m=new Marker();
		m.brand="rynolds";
		m.price=50;
		m.color="white";
		m.refill=r;
		
		System.out.println(m.brand+" "+m.price+" "+m.color+" "+m.refill.brand+" "+m.refill.price+" "+m.refill.color);
	}

}
