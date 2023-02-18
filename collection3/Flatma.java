package collection3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatma {
	public static void main(String[] args) {
		
	List<Integer>ar=Arrays.asList(5,4,3);
	List<Integer>arr=Arrays.asList(50,40,30);
	
	
	List<List<Integer>>a=Arrays.asList(ar,arr);
	System.out.println(a);
	
	List<Integer>f=a.stream().flatMap(v->v.stream()).collect(Collectors.toList());
	
	System.out.println(f);
}
}
