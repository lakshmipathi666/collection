package collection;

import java.util.ArrayList;

public class Names {
public static void main(String[] args) {
	ArrayList<String>names=new ArrayList<>();
	names.add("lakshmi");
	names.add("vetri");
	names.add("pechi");
	names.add("sowmi");
	names.add("sinduja");
	names.add("balaji");
	names.add("arun");
	names.remove(5);
	names.set(5, "chemmathu");
	names.forEach(x->{if(x.startsWith("s")) {
		System.out.println(x);
	}
	else {
		System.out.println("invalid");
	}
	
	}
	);
	
	names.forEach(x->System.out.println(x));
	
	for(String x:names) {
		System.out.println(x);
	}
}
}

