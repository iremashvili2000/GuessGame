package game;

public class gameLauncher {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main mathod work...");
		Player p1=new Player();
		p1.guess();
		GuessGame game=new GuessGame();
		game.startGame();

	}

}
