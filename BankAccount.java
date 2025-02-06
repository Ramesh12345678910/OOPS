package mphasis.com.shape;
import java.util.*;

class BankAccount1 {
	
	public  int exit()
	{
		return 0;
	}
	public  int deposit(int am)
	{
		int initial=0;
		initial+=am;
		return initial;
	}
	public int withdrawl(int a,int b)
	{
		return 0;
	}
}
class Savingsaccount extends BankAccount1
{
	@Override
	public int withdrawl(int dep,int l)
	{
		return dep-=l;
	}
}
class Checkingsaccount extends BankAccount1
{
	@Override
	public int withdrawl(int dep,int l)
	{
		dep-=l;
		return dep/10;
	}
}
public class BankAccount{
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	BankAccount1 ab=new BankAccount1();
	int dep=0;
	System.out.println("enter the type of yout account:");
	System.out.println("1.Savingsaccount"+" "+"2.withdrawlaccount");
	int type=sc.nextInt();
	while(true)
	switch(type){
	case 1:
		System.out.println("1.Deposit"+" "+"2.Withdrawl");
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.println("enter the amount");
			int am=sc.nextInt();
			dep+=ab.deposit(am);
		}
		else
		{
			BankAccount1 sac=new Savingsaccount();
			int l=sc.nextInt();
			 
			System.out.println("the remained balance is:"+sac.withdrawl(dep,l));
		}
			break;
			
	case 2:
	    System.out.println("Your initial amount is:0");
	    System.out.println("1.Deposit"+" "+"2.withdrawl");
	    int kk=sc.nextInt();
	    if(kk==1)
		{
			System.out.println("enter the amount");
			int am=sc.nextInt();
		    dep+=ab.deposit(am);
		}
	    else
	    {
	    	BankAccount1 mac=new Checkingsaccount();
	    	int m=sc.nextInt();
	    	System.out.println("the remained balance is"+mac.withdrawl(dep, m));
	    }
	    break;
	default:
		 System.out.println("Invalid Entry!");
		 ab.exit();
		 break;
		 
	}

}
	
}


