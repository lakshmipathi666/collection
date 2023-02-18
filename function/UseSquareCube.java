package function;

public class UseSquareCube {
	public static void main(String[] args) {
		SquareCube sq=new SquareCube();
		System.out.println("the Square is "+sq.findSquare(2));
		System.out.println("the cube is "+sq.findCube(2));
		
	}

}
class SquareCube {
	public int findSquare(int a) {
		return a*a;
	}
	public int findCube(int b) {
		return b*b*b;
	}
}