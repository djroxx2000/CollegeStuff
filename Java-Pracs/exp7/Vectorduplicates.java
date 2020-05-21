import java.util.Scanner;
import java.util.Vector;

class Vectorduplicates {

		public static void main(String[] args) {

				Scanner s=new Scanner(System.in);
				Vector<String> v=new Vector<String>(20);

				System.out.println("How many strings do u want to enter???");
				int n=s.nextInt();

				for(int i=0;i<n;i++)
						v.add(s.next());

	       int f=0;

				System.out.println("Which 'next' string do you want to enter ( if present already it'll get deleted) ?");

				String str=s.next();

				for(int j=0;j<v.size();j++) {
					if((v.get(j)).equals(str)) {
							v.remove(j);
							f=1;
					}
				}
				
					if(f==0)
							v.add(str);

					for(int i=0;i<v.size();i++)
							System.out.println(v.get(i));
		}
}
