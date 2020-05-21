
import java.util.Scanner;

class Reversemenu { public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int choice;

		do {
					System.out.println("Enter 1 to calc reverse of a number \n Enter 2 to calc 1 + 2 + 3.. upto n terms \n Enter 3 to exit menu :)");
					choice =s.nextInt();

					switch(choice){
							case 1:
										System.out.println("Enter a number to call its reverse :");
							 			int number=s.nextInt();
							 			int rev=rever(number);
							 			System.out.println("Reverse of the number" + number + " is " + rev);
										break;
							case 2:
										System.out.println("Enter value of n");
							  		int n=s.nextInt();
										int series= sum(n);
										System.out.println("sum of "+ n + " terms is" +  series);
										break;
							case 3:
							 			System.out.println("exitting");
										break;
							default:
											System.out.println("invalid choice");
			}
	}while(choice!=3);

}
public static int sum(int n){

	 	int sum1;
		if(n==0)
				return 0;
		else
				return(n+sum(n-1));
}
public static int rever(int number){
		int sum=0;
		int rem;
		while(number>0){
	    sum=(sum*10)+(number%10);
	    number=number/10;
	   }
	  return sum;
	}
}

/* output:
Enter 1 to calc reverse of a number
 Enter 2 to calc 1 + 2 + 3.. upto n terms
 Enter 3 to exit menu :)
2
Enter value of n
5
sum of 5 terms is15
Enter 1 to calc reverse of a number
 Enter 2 to calc 1 + 2 + 3.. upto n terms
 Enter 3 to exit menu :)
1
Enter a number to call its reverse :
13
Reverse of the number13 is 31
Enter 1 to calc reverse of a number
 Enter 2 to calc 1 + 2 + 3.. upto n terms
 Enter 3 to exit menu :)
3
exitting menu bye bye

 */
