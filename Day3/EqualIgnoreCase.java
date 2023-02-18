package Day3;

public class EqualIgnoreCase {
	public static void main(String [] args) {
		String word="pandi";
		String word1="PANDI";
		boolean isEqualIgnoreCase=word.equalsIgnoreCase(word1);
		
		System.out.println("the word and Word1 are "+isEqualIgnoreCase);
		
	}

}
