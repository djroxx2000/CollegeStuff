package javapracs;

import java.util.Scanner;

public class Account {
    public int Account_id;
    public double balance;
	
	Account(){
	Account_id=0;
	balance=69.0129;
	}
	Account(int iden,double bal)
	{
		Account_id=iden;
		balance=bal;
		
	}
	
	public static void main(String[] args) {
		System.out.println("object details using default const :");
		Scanner s=new Scanner(System.in);
		Account a1=new Account();
		System.out.println("Account id : " + a1.Account_id + " balance:" + a1.balance);
		System.out.println("Enter id and balance for ur account :");
		int iden=s.nextInt();
		double bal=s.nextDouble();
		Account a2=new Account(iden,bal);
		System.out.println("Account id : " + a2.Account_id + " balance:" + a2.balance);

	}

}


/* OUTPUT
object details using default const :
Account id : 0 balance:69.0129
Enter id and balance for ur account :
69
19202
Account id : 69 balance:19202.0
*/