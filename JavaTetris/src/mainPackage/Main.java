package mainPackage;

public class Main {
	//Init variables for main class
	static int start = 1;
	static int currentFrame = 0;
	
	//Init objects of other classes
	Board board = new Board();
	Shape shape  = new Shape();
	Scoreboard scoreboard = new Scoreboard();
	
	public static void main(String[] args){
		while (start==1){
			int frame = currentFrame/100000;
			System.out.println(frame);
			currentFrame++;
		}
	}
}
