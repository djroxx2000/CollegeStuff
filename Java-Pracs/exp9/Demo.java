import hritik.kothari.*;

class Demo {

	      public static void main(String[] args) {
	    	 for(int i=0;i<args.length;i++) {
			Greeter g = new Greeter(args[i]);
			g.sayHello();

			Advisor ad=new Advisor();
			String s=ad.getAdvice();
			System.out.println(s);
			g.sayGoodbye();
		}}

}

/* OUTPUT
Hello hritik
Without labor nothing prospers.
GoodBye hritik
Hello varad
The ones who say you can�t are too afraid you will.
GoodBye varad

*/
