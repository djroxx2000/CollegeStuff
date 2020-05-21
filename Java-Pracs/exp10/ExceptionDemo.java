import java.util.Scanner;

class ExceptionDemo {


		 public static void main(String[] args) {
             int marks;
             String name;
             String seatno;
             String date;

			 Scanner s=new Scanner(System.in);

			 System.out.println("Enter Name , Seat no , date : ");
			 name=s.next();
			 seatno=s.next();
			 date=s.next();


			try {
				System.out.println("Enter marks");
				marks=s.nextInt();
				if(marks<0 || marks >100) {
					throw new MarksOutOfBoundsException(marks);
				}
				System.out.println(name + "'s Result is : " + "\n" + "Seat no : "+ seatno + " \n Date : " + date + "\n "  + "Marks: "  + marks);}
				catch(MarksOutOfBoundsException e) {
				  System.out.println(e);
				}


		}

}
class MarksOutOfBoundsException extends Exception{
	int m;
	MarksOutOfBoundsException(int marks){
		m = marks;
	}
	 public String toString() {
	 return "Invalid Marks Entered :" + m;
 }

 }
