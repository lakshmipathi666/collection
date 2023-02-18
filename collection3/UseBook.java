package collection3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseBook {
	public static void main(String[] args) {
		Book b1=new Book(1,"bharathi",150,"kuyil pattu",195,2016);
		Book b2=new Book(2,"thiruvalluvar",1500,"thirukuaral",1100,2014);
		Book b3=new Book(3,"na.Muthukumar",67,"aniladum vunjal",80,2020);
		Book b4=new Book(4,"lakshmi",190,"kadhal",200,2023);
		Book b5=new Book(5,"kavi",150,"kavithai",500,2017);
		Book b6=new Book(6,"vali",679,"kadal",654,2019);
		
		HashMap<Integer,Book>b=new HashMap<>();
		b.put(b1.getBookId(), b1);
		b.put(b2.getBookId(), b2);
		b.put(b3.getBookId(), b3);
		b.put(b4.getBookId(), b4);
		b.put(b5.getBookId(), b5);
		b.put(b6.getBookId(), b6);
		
		b.values().stream().filter(x->x.getNoOfPages()>1000).forEach(x->System.out.println(x));
		
		b.keySet().stream().forEach(x->System.out.println(x));
		
		b.keySet().stream().forEach(x->System.out.println(b.get(x)));
		
		System.out.println("=========");
		
		List<Book>price=b.values().stream().filter(x->x.getPrice()>=1000).collect(Collectors.toList());
		System.out.println(price);
		
		Map<Integer,Book>lowPrice=b.values().stream().filter(x->x.getPrice()<100).collect(Collectors.toMap(a->a.getBookId(),g->g));
		
		System.out.println(lowPrice);
		
		List<String>name=b.values().stream().filter(x->x.getPrice()>=500).map(x->x.getAuthorName()).collect(Collectors.toList());
		
		System.out.println(name);
		
		List<Integer>nameK=b.keySet().stream().filter(x->b.get(x).getPrice()>=500).collect(Collectors.toList());
		
		System.out.println(nameK);
		
				
	}
}
