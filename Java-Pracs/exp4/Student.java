import java.util.*;
class Student{
    int r,a;
    String n="" ;

    Student(){
        r = 8684;
        a = 18;
        n = "dafghj";
    }

    Student(int age,int rollno){
        a =age;
        r =rollno;
    }

    Student(int age,int rollno,String name){
        a =age;
        r =rollno;
        n =name;
    }


    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        
        Student s1 = new Student();
        System.out.println("age is"+s1.a);
        System.out.println("rollno is"+s1.r);
        System.out.println("name is"+s1.n);


        System.out.println("Enter age and roll no");
        int age = s.nextInt();
        int rollno = s.nextInt();
        Student s2 = new Student(age,rollno);
        System.out.println("age is"+s2.a);
        System.out.println("rollno is"+s2.r);


        System.out.println("Enter the age,roll no,name");
        int c= s.nextInt();
        int b = s.nextInt();
        String d= s.next();
        Student s3 = new Student(c,b,d);
        System.out.println("age is"+s3.a);
        System.out.println("rollno is"+s3.r);
        System.out.println("name is"+s3.n);

    }
}
