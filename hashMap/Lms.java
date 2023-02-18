package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Lms {
	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(508, "viji");
		lms.put(1046, "petchi");
		lms.put(1041, "iaskshmi");
		lms.put(1050, "muthu");
		lms.put(1646, "petchi");
		lms.put(45454, "Ravi");
	//	System.out.println(lms);
	//	System.out.println(lms.keySet());
	//	for(Integer x:lms.keySet()) {
	//	System.out.println(x);
	//}
//		for(String x:lms.values()) {
//		System.out.println(x);
//	}
//		Iterator<Integer>it=lms.keySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Iterator<String>it=lms.values().iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("v")) {
				
			System.out.println(it.next());
		}
			else {
				System.out.println("Invalid");
			}
		}

	}
}
