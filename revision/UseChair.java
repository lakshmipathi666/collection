package revision;

public class UseChair {
	public static void main(String[] args) {
		
	Chair chair1=new Chair();
	chair1.material="Plastic";
	chair1.isRocking=true;
	chair1.price=3000;
	chair1.discountPercent=18;
	chair1.netPrice=chair1.price+(chair1.price*(chair1.discountPercent/100));
	
	Chair chair2=new Chair();
	chair2.material="sand";
	chair2.isRocking=false;
	chair2.price=2000;
	chair2.discountPercent=10;
	chair2.netPrice=chair2.price+(chair2.price*(chair2.discountPercent/100));
	
	Chair chair3=new Chair();
	chair3.material="stainless steel";
	chair3.isRocking=true;
	chair3.price=2500;
	chair3.discountPercent=15;
	chair3.netPrice=chair3.price+(chair3.price*(chair3.discountPercent/100));
	
	if((chair1.netPrice<chair2.netPrice)&&(chair1.netPrice<chair3.netPrice)) {
		System.out.println("chair1 "+(chair1.netPrice+2500));
	}
	else if((chair2.netPrice<chair1.netPrice)&&(chair2.netPrice<chair3.netPrice)) {
		System.out.println("chair2 "+(chair2.netPrice+2500));
	}
	else {
		System.out.println("chair3 "+(chair3.netPrice+2500));
	}
	
	

}
}
