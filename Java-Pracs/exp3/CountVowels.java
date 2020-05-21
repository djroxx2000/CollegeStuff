import java.util.Scanner;

class CountVowels {
		public static void main(String[] args) {

				System.out.println("Enter a string to calc number of vowels and consonants in it");
				Scanner s=new Scanner(System.in);
				String str=s.next();
				char arr[]=new char[20];
				arr=str.toCharArray();
				int vowels=0;
				int conso=0;
				for(int i=0;i<arr.length;i++)
				{
				 if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
					 vowels++;
				 else
					 conso++;
				}
				System.out.println("Number of vowels in the string is " + vowels + "Number of consonants is"+ conso);
		}
}

/*OUTPUT
 Enter a string to calc number of vowels and consonants in it
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Number of vowels in the string is 5Number of consonants is21
*/
