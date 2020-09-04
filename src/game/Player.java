package game;

public class Player {
int number;
	public void guess() {
		 number =(int) (10*Math.random());
		System.out.println("i'm guessing "+number);
		
	}
}
