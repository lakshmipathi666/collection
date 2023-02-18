package collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
public static void main(String[] args) {
	ArrayList<Integer>arr=new ArrayList<>();
	arr.add(152);
	arr.add(156);
	arr.add(62);
	arr.add(152);
	ArrayList<Integer>ar=new ArrayList<>();
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	
//	Collections.sort(arr);
//	System.out.println(arr);
//	
//	Collections.sort(arr,Collections.reverseOrder());
//	System.out.println(arr);
	
	//arr.stream().distinct().forEach(x->System.out.println(x));
	
	//boolean ans=arr.anyMatch(k->k
	
	//System.out.println(ans);
//	List<Integer>l=arr.stream().limit(2).collect(Collectors.toList());
//	System.out.println(l);
	
	arr.stream().sequential().forEach(x->System.out.println(x));

}
}
