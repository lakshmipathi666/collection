package Day3;

public class UpperCase {
	public static void main(String[]args) {
		String name="lakshmipathi";
		String upper=name.toUpperCase();
		System.out.println("The upper case is "+upper);
		
		String name2="MUTHU";
		String lower=name2.toLowerCase();
		System.out.println("The lower case is "+lower);
		
		String word="Chair";
		String word1="ChaiR";
		boolean isEquals=word.equals(word1);
		
		System.out.println(word+" is equal "+word1+" = "+isEquals);
		
		
	}

}
