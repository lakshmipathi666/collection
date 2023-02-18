package function;

public class UseCollege {
	public static void main(String[] args) {
		College c1=new College();
		c1.name="akshaya";
		c1.location="coimbatore";
		c1.fees=40000;
		c1.grade='B';
		College c2=new College();
		c2.name="PSG";
		c2.location="peelamedu";
		c2.fees=70000;
		c2.grade='O';
		College c3=new College();
		c3.name="Hindusthan";
		c3.location="coimbatore";
		c3.fees=80000;
		c3.grade='A';
		
		College[] colleges= {c1,c2,c3};
		System.out.println(c1.findMaxFees(colleges));
		
	}
}
class College {
	String name;
	String location;
	int fees;
	char grade;
	
	public String findMaxFees(College [] a) {
		int max=a[0].fees;
		String temp=null;
		for(int i=0;i<a.length;i++) {
			if(a[i].fees>max) {
				max=a[i].fees;
				temp=a[i].name;
			}
		}
		return temp;
	}
			}
		