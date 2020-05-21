package hritik.kothari;

 public class Advisor{
	public String[] advices= new String[5];
	public Advisor(){
		advices[0]="Advice :Stop Caring About the Things That Don't Matter.";
		advices[1]="Advice :Just Do It.";
		advices[2]="Advice :The ones who say you can�t are too afraid you will.";
		advices[3]="Advice :Without labor nothing prospers.";
		advices[4]="Advice :Do not whine� Do not complain. Work harder. Spend more time alone.";
	}
	public String getAdvice() {
		int no=(int)(Math.random() *4) + 0;
		return advices[no];
	}
 }
