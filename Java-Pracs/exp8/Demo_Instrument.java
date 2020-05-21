

class Demo_Instrument{
		public static void main(String[] args){

			Instrument[] ins=new Instrument[10];
			for(int i=0;i<10;i++){
				if(i==4||i==6||i==9)
					ins[i]=new Piano();

				else if(i==0||i==2||i==3||i==7)
					ins[i]=new Flute();

				else
					ins[i]=new Guitar();

			ins[i].play();
			if(ins[i] instanceof Piano)
				System.out.println(" Piano is playing ");

			if(ins[i] instanceof Flute)
				System.out.println(" Flute is playing ");

			if(ins[i] instanceof Guitar)
				System.out.println(" Guitar is playing");
				}
	}
}
abstract class Instrument{
	abstract void play();
}

class Piano extends Instrument{
	void play(){
		System.out.println("tan tan tan tan");
	}
}

class Flute extends Instrument{
	void play(){
		System.out.println("toot toot toot toot");
	}
}

class Guitar extends Instrument{
	void play(){
		System.out.println("tin  tin  tin tin");
	}
}
