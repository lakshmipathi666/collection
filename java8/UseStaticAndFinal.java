package java8;

public class UseStaticAndFinal {
	public static void main(String[] args) {
		StaticAndFinal f=new StaticAndFinal();
		StaticAndFinal f1=new StaticAndFinal();
		StaticAndFinal f2=new StaticAndFinal();
		
		StaticAndFinal.value=10;
		StaticAndFinal f3=new StaticAndFinal();
		StaticAndFinal f4=new StaticAndFinal();
		StaticAndFinal f5=new StaticAndFinal();
	}
}
