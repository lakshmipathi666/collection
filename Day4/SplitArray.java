package Day4;

public class SplitArray {
	public static void main(String[]args) {
	String name="world wide wonder";
	String[] split1=name.split(" ");
	
	System.out.println(split1[0]+split1[1]+split1[2]);
	
	int length1=split1[0].length();
	int length2=split1[1].length();
	int length3=split1[2].length();
	
	System.out.println(length1+"\n"+length2+"\n"+length3);
	
	String upperCase1=split1[0].toUpperCase();
	String upperCase2=split1[1].toUpperCase();
	String upperCase3=split1[2].toUpperCase();
	
	System.out.println(upperCase1+"\n"+upperCase2+"\n"+upperCase3);
	
	String name1="programs";
	
//	String concat=name.concat(name1);
	
//	System.out.println(" "+concat);
	
	String add=name+name1;
//	System.out.println(add);
	System.out.println(name+" "+name1);
	}
	

}
