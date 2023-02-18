package functionMethods;

import java8MethodRef.Methods;

public class UseMaxMin {
	public static void main(String[] args) {
		Methods m= new Methods();
		MaxMin mm= m :: findmax;
		
		int [] ages= {10,20,30};
		
		System.out.println(mm.findMa(ages));
		
		MaxMin mmm= m :: findmin;
		
		
		
		System.out.println(mmm.findMa(ages));
		
	}

}
