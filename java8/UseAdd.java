package java8;

public class UseAdd {
	public static void main(String[] args) {
		int []z={10,20,30,40};
	int max=0;
		Add a=(b)->{
			for(int i=0;i<b.length;i++) {
			if(b[i]>0) {
				max=b[i];
			}
			}
				return(max);	
		};
		
		System.out.println(a.findArray(z));
		
		}
	}


