package revision;

public class StringMax {
	public static void main(String[] args) {
		String a="redyello";
		String b="green";
		String exercise="max";
		switch(exercise){
		case "max":if (a.length()>b.length()){
			System.out.println(a+" is greater");
			
		}else {
			System.out.println(b+" is greater");
			
		}
		
		
		break;
		case "min":if (a.length()<b.length()) {
			System.out.println(a+" is smaller");
		}else
		{
			System.out.println(b+" is smaller");
		}
		break;
		
		}
	}

}
