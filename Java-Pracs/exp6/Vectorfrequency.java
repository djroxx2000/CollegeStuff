import java.util.Scanner;
import java.util.Vector;

class Vectorfrequency {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int choice;

        int c=0;
        Vector<String> v=new Vector<String>(20);

        System.out.println("how many elements do you want to add??");
        int size=s.nextInt();

        for( int j=0;j<size;j++){
          System.out.println("Enter element :");
        	v.add(s.next());
        }

        System.out.println("Size of the vector is " + v.size());

        String[] array = v.toArray(new String[v.size()]);


        System.out.println("Enter element to check freq");

        String ele=s.next();
        for(int i=0;i<v.size();i++) {
          if(array[i].equals(ele))
              c++;
        }

        System.out.println("freq is" + c);
    }
}
