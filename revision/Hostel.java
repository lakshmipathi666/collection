package revision;

public class Hostel {
	public static void main(String[] args) {

	String name="aruvi";
	String location="chennai";
	int rent=4500;
	boolean isWifi=true;
	boolean isAc=false;
	if(isWifi==true&&isAc==true) {
		System.out.println(rent+1000+2000);
	}else if(isWifi=true&&isAc==false) {
		System.out.println(rent+1000);
	}else if(isWifi==false&&isAc==true) {
		System.out.println(rent+2000);
	}else
	{
		System.out.println(rent);
	}
}
}