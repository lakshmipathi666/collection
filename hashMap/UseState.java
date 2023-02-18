package hashMap;

import java.util.HashMap;

public class UseState {
	public static void main(String[] args) {
		State s1=new State("TN","tamilnadu","tamil","Chennai");
		State s2=new State("KL","kerala","malayalam","thrivanandapuram");
		State s3=new State("AP","andharapradesh","telugu","bengaluru");
		State s4=new State("PB","punjab","punjabi","Chattisgarh");
		State s5=new State("Gu","gujarat","gujarathi","gandhinagar");
		
				
		HashMap<String,State>states=new HashMap<>();
		states.put(s1.getCode(),s1);
		states.put(s2.getCode(),s2);
		states.put(s3.getCode(),s3);
		states.put(s4.getCode(),s4);
		states.put(s5.getCode(),s5);
		
		for(String x:states.keySet()) {
			System.out.println(states.keySet());
		}
		
		
		
	}
}
