package function;

public class UseMaxNum {
	public static void main(String[] args) {
		MaxNum mn=new MaxNum();
		int[] nums= {5,15,26,8,3};
		System.out.println(mn.findMax(nums));
		System.out.println(mn.findMin(nums));
		
	}
	}


class MaxNum {
	public int findMax(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		return max;
	}
	
	public int findMin(int[]b) {
		int min=b[0];
		for(int i=b.length-1;i>=0;i--) {
			if(b[i]<min) {
				min=b[i];
				
			}
		}
		return min;
	}
	
}

