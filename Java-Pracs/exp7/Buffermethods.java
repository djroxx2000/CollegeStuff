
class Buffermethods {
		public static void main(String[] args) {
			String s1=new String(args[0]);
			String s2=new String(args[1]);
			System.out.println(s1+ " " + s2);
			StringBuffer s3=new StringBuffer(s1);
			StringBuffer s4=new StringBuffer(s2);
			s3.append(s4);
			System.out.println("Appended String is "+ s3);
			s4.insert(3,'X');
			System.out.println("Inserted X at posi posi 4 :  "  + s4);
			s4.replace(2,4,"NO");
			System.out.println("Replaced with NO : " + s4);
			s4.reverse();
			System.out.println("Reversed string is " + s4);
			s4.delete(3, 5);
			System.out.println("Deleted String is"  + s4);
			System.out.println("capacity of string is " + s3.capacity());
			s3.ensureCapacity(50);
			System.out.println("Ensured capacity of string is " + s3.capacity());
			System.out.println("Character at index 3 is " + s3.charAt(2));
			System.out.println("Length of string 1 is " + s3.length());
			System.out.println("Substring of first string is " + s3.substring(4));
		}
}
/* OUtPUT
  hello world
Appended String is helloworld
Inserted X at posi posi 4 :  worXld
Replaced with NO : woNOld
Reversed string is dlONow
Deleted String isdlOw
capacity of string is 21
Ensured capacity of string is 50
Character at index 3 is l
Length of string 1 is 10
Substring of first string is oworld
*/
