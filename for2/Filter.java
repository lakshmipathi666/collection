package for2;

public class Filter {
	public static void main(String[] args) {
		String email="Vijay.Vairamuthu.586@Gmail.Com";
		char[] name=email.toCharArray();
		int upper=0;
		int lower=0;
		int num=0;
		int symbol=0;
		for(int i=0;i<name.length;i++) {
			if(name[i]>='A'&&name[i]<='Z') {
				upper++;
			}
			else if(name[i]>='a'&&name[i]<='z') {
				lower++;
			}
			else if(name[i]>='0'&&name[i]<='9') {
				num++;
			}
			else {
				symbol++;
			}
		}
		System.out.println(upper+" Upper case");
		System.out.println(lower+" lower case");
		System.out.println(num+" number");
		System.out.println(symbol+" symbols");
	}

}
