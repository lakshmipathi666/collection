package Day5;

public class Sum2 {
	public static void main(String[]args) {
		String name="10,20,22,23,24";
//		int name1=Integer.parseInt(name[0]);
		
		String[] split1=name.split(",");
		
		
		
		
		int int1=Integer.parseInt(split1[0]);
		int int2=Integer.parseInt(split1[1]);
		int int3=Integer.parseInt(split1[2]);
		int int4=Integer.parseInt(split1[3]);
		int int5=Integer.parseInt(split1[4]);
		
		int add=int1+int2+int3+int4+int5;
		
		System.out.println("the value= "+add);
		
		
		
	}

}
