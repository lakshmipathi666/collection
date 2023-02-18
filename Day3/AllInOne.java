package Day3;

public class AllInOne {
	public static void main(String[]args) {
		String name="lakshmipathi";
		
		
		String upper=name.toUpperCase();
		
		String lower=name.toLowerCase();
		
		String name1="priya";
		
		boolean equals=name.equals(name1);
		
		boolean equalsIgnoreCase=name.equalsIgnoreCase(name1);
		
		boolean startwith=name.startsWith("l");
		
		boolean endWith=name1.endsWith("ya");
		
		boolean contain=name.contains("i");
		
		int length=name1.length();
		
		String concat=name.concat(name1);
		
		int indexOf=name1.indexOf('p');
		
		char charat=name1.charAt(0);
		
		String substring=name.substring(0,7);
		
		System.out.println("upper case "+upper);
		System.out.println("lower case "+lower);
		System.out.println("equals is "+equals);
		System.out.println("equalsIgnarecase= "+equalsIgnoreCase);
		System.out.println("starts with= "+startwith);
		System.out.println("end with = "+endWith);
		System.out.println("contains = "+contain);
		System.out.println("length = "+length);
		System.out.println("concat = "+concat);
		System.out.println("index of name1= "+indexOf);
		System.out.println("char at name1= "+charat);
		System.out.println("substring of name 0-7 = "+substring);
	}
		
		
		

}
