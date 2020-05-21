import java.util.Scanner;

class Salary_exception_demo {
	public static void main(String[] args) {

		int da,ta,basicsalary;

		Scanner s=new Scanner(System.in);


		try {
				System.out.println("Enter Basic salary");
				basicsalary=s.nextInt();
				if(basicsalary<8000)
						throw new PayOutOfBoundsException(basicsalary);

				da=(10 * basicsalary) / 100;
				ta=(10 * basicsalary) /100;
				int gross=basicsalary+da+ta;
				System.out.println("Gross Salary is : "  + gross);
		}
		catch(PayOutOfBoundsException e) {
				System.out.println(e);
		}
	}
}




class PayOutOfBoundsException extends Exception{

		int m;
		PayOutOfBoundsException(int salary){
		m = salary;
	}
	 public String toString() {
	 		return "Invalid Salary Entered ( less than 8000 ) :" + m;
 }

 }
