
import java.util.Scanner;

//find area of circle triangle and rectangle using same area method.
class MEthodOverloading {

public static void main(String[] args) {

			float len,breadth;
			float radius;
			int base,height;
			float area;
			int trianglearea;

			System.out.println(" ******MENU******");
		  System.out.println("Press 1 to calculate Area of Circle \n 2 for Triangle \n 3 for Rectangle ");
			Scanner s1=new Scanner(System.in);
			int x=s1.nextInt();

			switch(x){
			case 1:
						System.out.println("Enter radius to calculate area of circle");
						radius=s1.nextFloat();
						area=Area(radius);
						System.out.println("Area of circle is "+ area);
			 			break;
			case 2:
						System.out.println("Enter base and height for calc area of triangle");
						base=s1.nextInt();
						height=s1.nextInt();
						trianglearea=Area(base,height);
						System.out.println("Area of triangle is "+ trianglearea);
			 			break;
			case 3:
						System.out.println("Enter lena nd breadth for calc area of rect");
						len=s1.nextFloat();
						breadth=s1.nextFloat();
						area=Area(len,breadth);
						System.out.println("Area of rectangle is "+ area);
						break;
			default:
						System.out.println("invalid option");
			}

}

private static float Area(float len, float breadth) {
		float a=len*breadth;
		return a;
}

private static int Area(int base, int height) {
		int a=base*height/2;
		return a;
}

private static float Area(float radius) {
		float a=(float)(radius*radius*3.14);
		return a;
}


}
/* OUTPUT

 ******MENU******
Press 1 to calculate Area of Circle
 2 for Triangle
 3 for Rectangle
3
Enter lena nd breadth for calc area of rect
2
5
Area of rectangle is 10.0


*/
