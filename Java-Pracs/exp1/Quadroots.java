//Date of Performance 17-07-2019

import java.util.Scanner;

class Quadroots {
	public static void main(String[] args) {

				Scanner s = new Scanner(System.in);
				System.out.println("Enter a , b , c of a quad equation ");
				int a=s.nextInt();
				int b=s.nextInt();
				int c=s.nextInt();

				double Delta =(double) (b*b)-(4*a*c)	;
				if(Delta>0)    //Real and Distinct roots
			{
					double Root1 = (double)((-b+Math.sqrt(Delta))/(2*a)) ;
					double Root2 = (double)((-b-Math.sqrt(Delta))/(2*a));
					System.out.println(" Roots of the quad equation are :" + Root1 + Root2);
			}

			else if(Delta==0)  //Real and equal roots
			{
					double  Root1 =(double) -b/(2*a);
					System.out.println(" Root1 = Root2 = : " +  Root1    );
			}
			else //unreal roots
					System.out.println("  Roots not real");
	}
}

/* OUTPUT
Enter a , b , c of a quad equation
1
2
1
 Root1 = Root2 = : -1.0

 Enter a , b , c of a quad equation
5
6
7
  Roots not real
 */
