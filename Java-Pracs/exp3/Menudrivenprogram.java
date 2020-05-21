import java.util.*;

//Fact , Reverse , Check if Armstrong
class Menudrivenprogram {

	public static void main(String[] args) {
				Scanner s= new Scanner(System.in);
				System.out.println("Enter a number to start the menu :");
				int number=s.nextInt();

				int choice;
				do
					{
					 System.out.println("******MENU******");
					 System.out.println(" What do u want to do with ur number? :");
					 System.out.println(" Enter 1 to Calculate Factorial  :");
					 System.out.println(" Enter 2 to Find its Reverse :");
					 System.out.println(" Enter 3 to Find if its an Armstrong number or not :");
					 System.out.println("Enter 4 to exit the Menu");
					 choice= s.nextInt();
					switch(choice)
					{
							case 1:
										int  fact=factorial(number);
							      System.out.println("Factorial of the number " + number + " is " + fact);
										break;
							case 2:
										int reverse=rev(number);
									  System.out.println("Reverse of the number is " + reverse);
									  break;
							case 3:
										if(isArmstrong(number)==1)
								    System.out.println("It is an Armstrong number");
										else
										System.out.println("Not Armstrong ");
										break;
							case 4:
										System.out.println(" Exiting the MENU GOODBYE :) ");
										break;
							default:
										System.out.println("invalid choice ");
					}
			} while(choice!=4);
}

  public static int isArmstrong(int number) {

			int c=0,b,temp;
			temp=number;
		    while(number>0){
				    b=number%10;
				    number=number/10;
				    c=c+(b*b*b);
		    }
			if(temp==c)
					return 1;
			else
					return 0;
	}

	public static int rev(int number) {
			int a=0;
			while(number != 0) {
		        int digit = number % 10;
		        a = a * 10 + digit;
		        number /= 10;
		    }
		return a;
	}

	public static int factorial(int number) {
		int f=1;
		for(int i=1;i<=number;i++)
				f=f*i;

		return f;
	}
}
