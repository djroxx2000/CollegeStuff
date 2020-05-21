//Date of performance 17-07-2019
import java.util.Scanner;

class Count {
	public static void main(String[] args) {
		
			System.out.println("Enter a string to count ints, chars , spaces and others. ");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			char[] ch=new char[1000];
			ch = str.toCharArray();  //Converts string to char array
			int spaces =0;
			int letters = 0;
			int others =0 ;
			int numbers=0;

			for(int i=0;i<str.length();i++){
				if(Character.isLetter(ch[i]))
					letters++;

				else if(Character.isDigit(ch[i]))
				    numbers++;
				else if(ch[i]==' ')
				 spaces++;
				 else
					 others ++;
			}

			System.out.println("The number of letters are " + letters );
			System.out.println("The number of integers are " + numbers );
			System.out.println("The number of spaces are " + spaces );
			System.out.println("The number of others are " + others );

}
}
/* OUTPUT
 Enter a string to count ints, chars , spaces and others.
hritihk 1291 (&@!43
The number of letters are 7
The number of integers are 6
The number of spaces are 2
The number of others are 4
*/
