package oops1;

public class UseLaptop {
public static void main(String[] args) {
	Battery b=new Battery(5000,100);
	Laptop l=new Laptop("acer",10000,"grey","i5",true,b);
	System.out.println(l.getPrice());
}
}

