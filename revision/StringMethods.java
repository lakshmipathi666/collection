package revision;

public class StringMethods {
	public static void main(String[] args) {
	
	String a="Lakshmi pathi";
	String b="Muthui";
	char z='h';
	String y="hai";
	String upper=a.toUpperCase();
	System.out.println(upper);
	String lower=a.toLowerCase();
	System.out.println(lower);
	boolean c=a.equals(b);
	System.out.println(c);
	boolean d=a.equalsIgnoreCase(b);
	System.out.println(d);
	boolean e=a.startsWith("mu");
	System.out.println(e);
	boolean f=a.endsWith("i");
	System.out.println(f);
	String g=a.concat(b);
	System.out.println(g);
	boolean h=a.contains("th");
	System.out.println(h);
	char i=b.charAt(0);
	System.out.println(i);
	int j=a.indexOf("i");
	System.out.println(j);
	String k=a.substring(0,4);
	System.out.println(k);
	char[] l=y.toCharArray();
	System.out.println(l);
	String[] m=a.split(" ");
	System.out.println(m[1]);
	int o=a.length();
	System.out.println(o);
	
	}
}
