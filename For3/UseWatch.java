package For3;

public class UseWatch {
	public static void main(String[] args) {
		Watch watch1=new Watch();
		watch1.brand="titanksk";
		watch1.color="black";
		watch1.price=19000;
		watch1.rating=5.6f;
		
		Watch watch2=new Watch();
		watch2.brand="police";
		watch2.color="silver";
		watch2.price=5000;
		watch2.rating=8.9f;
		
		Watch watch3=new Watch();
		watch3.brand="fastrack";
		watch3.color="brown";
		watch3.price=3000;
		watch3.rating=4.2f;
		
		Watch watch4=new Watch();
		watch4.brand="timex";
		watch4.color="red";
		watch4.price=4500;
		watch4.rating=7.2f;
		
		Watch watch5=new Watch();
		watch5.brand="fossilsk";
		watch5.color="green";
		watch5.price=400;
		watch5.rating=9.5f;
		
		Watch[] watches= {watch1,watch2,watch3,watch4,watch5};
//		for(Watch w:watches){
//			System.out.println(w.brand+" "+w.color+" "+w.price+" "+w.rating);
//		}
//		int price=watches[0].price;
//		Watch x=null;
//		for(Watch w:watches){
//			if(w.price<price) {
//				price=w.price;
//				x=w;
//				
//			}
//		}
//		System.out.println(x.brand+" "+x.price+" "+x.color+" "+x.rating);
//	
	
//	int maxlength=watches[0].brand.length();
//	Watch x=null;
//	for(Watch w:watches) {
//		if(w.brand.length()>=maxlength) {
//			maxlength=w.brand.length();
//			x=w;
//		}
//		
//		}
//	System.out.println(x.brand+" "+x.price+" "+x.color+" "+x.rating);
	
	int maxLength=watches[0].brand.length();
	int price=watches[0].price;
	
	Watch x=null;
	for(Watch w:watches) {
		if(w.brand.length()%2==0&&w.price>=price) {
			maxLength=w.brand.length();
			price=w.price;
			x=w;
		}
	}
	System.out.println(x.brand+" "+x.price+" "+x.color+" "+x.rating);
		}
}
	
	
	