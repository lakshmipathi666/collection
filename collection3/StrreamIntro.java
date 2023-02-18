package collection3;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class StrreamIntro {
	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<>();
		num.add(100);
		num.add(156);
		num.add(954);
		num.add(485);
		num.add(566);
		num.add(111);
//		num.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		List<Integer>n=num.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		System.out.println(n);
		
		long c=num.stream().filter(x->x%2!=0).count();
		System.out.println(c);
		
	}
}

