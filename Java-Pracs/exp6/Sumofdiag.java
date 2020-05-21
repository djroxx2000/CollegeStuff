
import java.util.Scanner;

class Sumofdiag {

	public static void main(String[] args) {

			Scanner s=new Scanner(System.in);
			System.out.println("Enter no of rows and columns of the matrix to find sum of diagonal and non diagonal elements");
			int m=s.nextInt();
			int n=s.nextInt();

			if(m!=n)
					System.out.println("NOt a square matrix... enter details again !!!!");
			else{
						int[][] matrix=new int[m][n];
						System.out.println("Enter the elements of the matrix");
						for(int i=0;i<m;i++){
								for(int j=0;j<n;j++)
									matrix[i][j]=s.nextInt();
						}

						displaymatrix(matrix,m,n);
						int sumofd=0;
						int sumofnond=0;

						for(int i=0;i<m;i++){
								for(int j=0;j<n;j++){
										if(i==j)
												sumofd=sumofd+matrix[i][j];
										else
												sumofnond=sumofnond+matrix[i][j];
							}
						}

						System.out.println("Sum of diagonal elements is " + sumofd);
						System.out.println("Sum of non diagonal elements is " + sumofnond);
				}
			}

	private static void displaymatrix(int[][] matrix, int m, int n) {

			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++)
						System.out.print(" \t " + matrix[i][j]);
				System.out.print("\n");
			  }
		}
}

/* OUTPUT
Enter no of rows and columns of the matrix to find sum of diagonal and non diagonal elements
3
3
Enter the elements of the matrix
1
3
2
5
2
1
3
2
1
 	 1 	 3 	 2
 	 5 	 2 	 1
 	 3 	 2 	 1
Sum of diagonal elements is 4
Sum of non diagonal elements is 16
*/
