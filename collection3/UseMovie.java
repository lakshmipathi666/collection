package collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseMovie {
	public static void main(String[] args) {
		Movie m1=new Movie("kaka","Surya",2022,6.1f,1001);
		Movie m2=new Movie("kaththi","Vijay",2015,7.8f,100);
		Movie m3=new Movie("billa","Aijith",2022,7.0f,1000);
		Movie m4=new Movie("ayan","Surya",2023,9.8f,200);
		Movie m5=new Movie("dhasavatharam","KAmal",2000,6.8f,100);
		Movie m6=new Movie("kalayan","Rajini",1995,9.0f,1000);
		Movie m7=new Movie("jeeva","Vishnu",2002,1.5f,500);
		
		ArrayList<Movie>movies=new ArrayList<>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		
		Long p=movies.stream().filter(x->x.getMovieReleasedYear()==2022).count();
		
		System.out.println(p);
		
//		List<Movie>n=movies.stream().filter(x->x.getMovieReleasedYear()==2022).collect(Collectors.toList());
//		System.out.println(n);
//		
//		List<Movie>v=movies.stream().filter(x->x.getMovieReleasedYear()>=2020 && x.getRating()>=5).collect(Collectors.toList());
//		
//		System.out.println(v);
		
		Map<String,Movie>h=movies.stream().filter(x->x.getHeroName().equalsIgnoreCase("Surya")).collect(Collectors.toMap(a->a.getMovieName(),b->b));
		System.out.println(h);
		
		System.out.println("-------------");
		
		List<String>lowRate=movies.stream().filter(x->x.getRating()<4).map(x->x.getMovieName()).collect(Collectors.toList());
		
		System.out.println(lowRate);
		
		Long total=movies.stream().collect(Collectors.summingLong(x->x.getPrice()));
		
		System.out.println(total);
		
		Double avg=movies.stream().collect(Collectors.averagingDouble(x->x.getPrice()));
		
		System.out.println(avg);
		
		Movie g=movies.stream().max(Comparator.comparing(Movie::getPrice)).get();
		Movie g1=movies.stream().max(Comparator.comparing(f->f.getPrice())).get();

		
		System.out.println(g);
		System.out.println(g1);

		
		Movie o=movies.stream().min(Comparator.comparing(Movie::getPrice)).get();
		
		System.out.println(o);
//				Collections.sort(movies);
//		
//		System.out.println(Arraylist.toString(movies));
//		
		
	}
}
