package exp;

public class FindStackOverflow {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		FindStackOverflow of=new FindStackOverflow();
		of.findA();
	}
}

	
