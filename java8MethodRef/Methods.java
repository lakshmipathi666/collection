package java8MethodRef;

import java8.Add;

public class Methods {
	public int findmax(int [] b){
		int max=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>max) {
				max=b[i];
			}
			}
				return(max);	
	}
	public int findmin(int [] c){
		int min=c[0];
		for(int i=0;i<c.length;i++) {
			if(c[i]<min) {
				min=c[i];
			}
			}
				return(min);
}
}
