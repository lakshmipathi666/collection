package collection;

import java.util.ArrayList;

public class Ages {
	public static void main(String[] args) {
		ArrayList<Integer>ages=new ArrayList<>();
		ages.add(25);
		ages.add(28);
		ages.add(29);
		ages.add(25);
		ages.add(22);
		ages.add(26);
		ages.add(25);
		ages.remove(5);
		ages.set(3, 50);
		for(int i=0;i<ages.size();i++) {
			System.out.println(ages.get(i));
		}
		
	}

}
