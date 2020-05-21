
import java.time.Duration;
import java.time.Instant;


class Two_Child_threadsdemo {
		public static void main(String[] args) {
			Prime_thread prime=new Prime_thread();
			prime.start();
			Fibo_thread fibo=new Fibo_thread();
			fibo.start();
		}
}

class Fibo_thread extends Thread{
		int n1=0,n2=1,n3;
		public void run(){
				Instant start=Instant.now();
			  System.out.println("Fibonacci series upto 20 terms is :");
				System.out.print(n1+" "+n2);           //0 and 1
			    for(int i=2;i<20;i++){
			    	  n3=n1+n2;
			    	  System.out.print(" "+n3);
			    	  n1=n2;
			    	  n2=n3;
			    }
				Instant end=Instant.now();
				System.out.println("\n Time Elapsed(in nano seconds): ");
				System.out.println(Duration.between(start, end).getNano());
	}
}

class Prime_thread extends Thread{

	int ct=0,n=0,i=1,j=1;
	public void run(){
			Instant start = Instant.now();
			System.out.println("First15 prime nos are :");
			while(n<15){
					j=1;
					ct=0;
							while(j<=i){
									if(i%j==0)
									ct++;
									j++;
							}
					if(ct==2){
							System.out.print(i);
							n++;
					}
					i++;
			}
			Instant end = Instant.now();

			System.out.println("\n Time Elapsed(in nano seconds): ");
			System.out.println(Duration.between(start, end).getNano());

		}
}

/* OUTPUT
First15 prime nos are :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 Time Elapsed(in nano seconds):
24000000
Fibonacci series upto 20 terms is :
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
 Time Elapsed(in nano seconds):
1000000
*/
