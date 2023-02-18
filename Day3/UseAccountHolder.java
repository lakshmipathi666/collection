package Day3;

public class UseAccountHolder {
	public static void main(String[]args) {
		AccountHolder a1=new AccountHolder();
		a1.name="mano";
		a1.age=26;
		a1.gender="male";
		a1.accountNumber=2833048612583l;
		a1.monthlyIncome=21000;
		a1.savingsPercentage=18;
		int savingAmountA1=a1.monthlyIncome*a1.savingsPercentage/100;
		
		
		AccountHolder a2=new AccountHolder();
		a2.name="Savithri";
		a2.age=25;
		a2.gender="Female";
		a2.accountNumber=2833048612584L;
		a2.monthlyIncome=20000;
		a2.savingsPercentage=20;
		int savingAmountA2=a1.monthlyIncome*a2.savingsPercentage/100;
		
		AccountHolder a3=new AccountHolder();
		a3.name="kamban";
		a3.age=30;
		a3.gender="male";
		a3.accountNumber=2833048612585L;
		a3.monthlyIncome=30000;
		a3.savingsPercentage=10;
		int savingAmountA3=a3.monthlyIncome*a3.savingsPercentage/100;
		
		
		System.out.println("The monthly Savings amount of Employee1= "+savingAmountA1);
		System.out.println("The monthly Savings amount of Employee2= "+savingAmountA2);
		System.out.println("The monthly Savings amount of Employee3= "+savingAmountA3);
		
		
	}

}
