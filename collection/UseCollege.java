ackage collection;

import java.util.ArrayList;

public class UseCollege {
	public static void main(String[] args) {
		College c1=new College("lakshmi",true,21,"englsh");
		College c2=new College("muth",true,21,"history");
		College c3=new College("ravi",false,21,"maths");
		College c4=new College("saran",false,22,"history");
		
		College c5=new College("ram",true,25,"hindi");
		College c6=new College("jack",false,21,"englsh");
		ArrayList<College>col=new ArrayList<>();
		col.add(c1);
		col.add(c2);
		col.add(c3);
		col.add(c4);
		col.add(c5);
		col.add(c6);
		ArrayList<College>maleList=new ArrayList<>();
		for(College c:col) {
			if(c.getIsMale()==true) {
				maleList.add(c);
				
			}
		}
		maleList.forEach(x->System.out.println(x));
		
		
		ArrayList<College>historySubject=new ArrayList<>();
		for(College x:col) {
			if(x.getSubject().equalsIgnoreCase("history")) {
				historySubject.add(x);
			}
		}
		historySubject.forEach(x->System.out.println(x));
	}
}
