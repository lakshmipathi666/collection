package hashMap;

import java.util.HashMap;

public class Details1 {
	public static void main(String[] args) {
		HashMap<Long,String>detail=new HashMap<>();
		detail.put(9845690795l,"lakshmi");
		detail.put(9600690795l, "muthu");
		detail.put(9843494884l, "prabhu");
		detail.put(9600690795l,"pathi");
		detail.put(9805847394l,"Sathya");
		for(Long x:detail.keySet()) {
			System.out.println(detail.get(x));
		}
	}
}
