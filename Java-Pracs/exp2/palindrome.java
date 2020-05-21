//Date of Performance : 17-7-2019
import java.util.*;
class palindrome 
{ 
  public static void main(String args[])
 {
    System.out.println("Enter a string to find if its a palindrome or not ");
    Scanner s = new Scanner(System.in); 

   String str  = new String();
  String reverse = new String();
  str= s.next();
  int len = str.length();
for(int i=len-1;i>=0;i--)
 {
reverse = reverse + str.charAt(i);
  }
 

System.out.println(reverse);

if(str.equals(reverse))
System.out.println(" Palindrome ");
else
 System.out.println("NOt a palindrome ");



}}

/* OUTPUT 

  8677@acer22:~/8677/java$ java palindrome
Enter a string to find if its a palindrome or not 
HRITHIK
KIHTIRH
NOt a palindrome 
8677@acer22:~/8677/java$ java palindrome
Enter a string to find if its a palindrome or not 
NITIN
NITIN
Palindrome
  */  
