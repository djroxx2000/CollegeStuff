//matrix add,multiply
import java.util.Scanner;

public class Menu_2Darray {
		public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				int m,n,q,choice;
						do {
							System.out.println("**********MENU********");
							System.out.println("Enter 1 to add 2 matrices \n 2 to multiply 2 matrices \n 3 to exit this menu ...");
							choice=s.nextInt();
						 switch(choice) {
						 case 1:
						 					System.out.println("Enter the number rows and columns for 2d arrays of size  to add them..");
											m=s.nextInt();
											n=s.nextInt();

											int[][] a=new int[m][n];
											int[][] b=new int[m][n];
											for(int i=0;i<m;i++)
											{
												for(int j=0;j<n;j++)
												{
												System.out.println("Enter elements of a");
												a[i][j]=s.nextInt();
												}

											}
											displaymatrix(a,m,n);
											for(int i=0;i<m;i++)
											{
													for(int j=0;j<n;j++)
													{
													System.out.println("Enter elements of b");
													b[i][j]=s.nextInt();
													}
											}
											displaymatrix(b,m,n);
											addmatrix(a,b,m,n);
											break;

	 						case 2:
											System.out.println("Enter m , n and q to Multiply  two matrices of order  M X N and N X Q 	");
											 m=s.nextInt();
											 n=s.nextInt();
											 q=s.nextInt();

												int[][]c=new int[m][n];
												int[][]d=new int[n][q];
												for(int i=0;i<m;i++) {
											  		for(int j=0;j<n;j++)
											    {
															System.out.println("Enter elements of first matrix");
															c[i][j]=s.nextInt();
											    }
												}
												displaymatrix(c,m,n);
												for(int i=0;i<n;i++)
												{
											  		for(int j=0;j<q;j++)
											    {
														System.out.println("Enter elements of d");
														d[i][j]=s.nextInt();
											    }
												}
												displaymatrix(d,n,q);

												multimatrix(c,d,m,n,q);
													break;
	 							case 3:
												System.out.println("Exitting");
												break;
								default :
												System.out.println("invalid choice bro...");
	 									}
									}while(choice!=3);
				}

		private static void multimatrix(int[][] c, int[][] d,int m ,int n , int q) {
						int i,j,k;
						int e[][]=new int[10][10];

						for(i=0;i<m;i++) {
							for(j=0;j<q;j++)
							{
								e[i][j]=0;
								for(k=0;k<n;k++) {
									e[i][j]=e[i][j]+c[i][k]*d[k][j];
								}
							}


						}
							displaymatrix(e,m,q);
				}

			private static void addmatrix(int[][] a, int[][] b,int m,int n) {
				Scanner s=new Scanner(System.in);

				int[][] c=new int[m][n];
				for(int i=0;i<m;i++){
					for(int j=0;j<n;j++)
							c[i][j]=a[i][j]+b[i][j];
				}
				System.out.println("Sum of a and b matrices ::: \n");
				displaymatrix(c,m,n);
		}


		private static void displaymatrix(int[][] c,int a,int b)
			{

				for(int i=0;i<a;i++)
				{
					for(int j=0;j<b;j++)
							System.out.print ("\t" + c[i][j]);

					System.out.print("\n");
				}
	}
}
