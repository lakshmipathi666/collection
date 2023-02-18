package hashMap;

import java.util.HashMap;

public class Introlms {
	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(508, "viji");
		lms.put(1046, "petchi");
		lms.put(1041, "laskshmi");
		lms.put(1050, "muthu");
		lms.put(1646, "petchi");
		lms.put(45454, "Ravi");
		System.out.println(lms);
		System.out.println(lms.keySet());
		
		System.out.println(lms.values());

	}
}
