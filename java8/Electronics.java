package java8;

public interface Electronics {
	public default String findPower(boolean isOffOrOn) {
		if(isOffOrOn) {
			return ("Product is Working");
		}
		else {
			return ("product is not Working");
		}
	}
	public int findResaleValue(int price);
}
