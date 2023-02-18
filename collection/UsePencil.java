package collection;

import java.util.ArrayList;

public class UsePencil {
	public static void main(String[] args) {
		ArrayList<String>pen=new ArrayList<>();
		pen.add("Apsara");
		pen.add("natraj");
		pen.add("camlin");
		pen.add("reynols");
		pen.add("montex");
		pen.add("jel");
//		System.out.print(pen);
		String num="";
		for(int i=0;i<pen.size();i++) {
			num=num+pen.get(i)+" ";
		}
		System.out.println(num);
	}
}
