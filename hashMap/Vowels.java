package hashMap;

import java.util.HashMap;

public class Vowels {
	public static void main(String[] args) {
		HashMap<Long,String>detail=new HashMap<>();
		detail.put(9845690795l,"lkshm");
		detail.put(9600690795l, "muthu");
		detail.put(9843494884l, "prabhu");
		detail.put(9600690795l,"pathi");
		detail.put(9805847394l,"Sathya");
		for(Long x:detail.keySet()) {
			if(detail.get(x).contains("a")||detail.get(x).contains("e")||detail.get(x).contains("i")||detail.get(x).contains("o")||detail.get(x).contains("u")) {
				System.out.println(detail.get(x));
			}
		}
	}
}
