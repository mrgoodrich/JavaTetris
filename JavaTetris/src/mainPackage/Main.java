package mainPackage;

public class Main {
	
	//Init variables for main class
	static long start = 1;
	static long currentFrame = 0;
	static long mostRecentFrameUsed = 0;
	static long frameSmall = 0;
	static boolean[][] grid;

	//Init objects of other classes
	static Board board = new Board();
	static Shape shape  = new Shape();
	static Scoreboard scoreboard = new Scoreboard();
	
	//Main method
	public static void main(String[] args){

		//Set values before frames start running
		grid = new boolean[20][10]; //ADD board.getWidth()][board.getHeight()
		for (int i=0; i<grid.length; i++){
			for (int j=0; j<grid[0].length;j++){
				grid[i][j] = false;
			}
		}
		
		//Runs frame
		while (start==1){
			frameSmall = (int)(currentFrame / 300000000);
			if (mostRecentFrameUsed != frameSmall){
				update();
				//System.out.println(frameSmall);
				mostRecentFrameUsed = frameSmall;
			}
			currentFrame++;
		}
		if (currentFrame > 300000000 * 200){
			currentFrame = 0;
		}
	}
	
	//Updates every frame
	static void update(){
		for (int i=0; i<grid.length;i++){
			for (int j=0; j<grid[0].length;j++){
				if (Math.random() * 100 > 50){
					grid[i][j] = true;
				}
				else {
					grid[i][j] = false;
				}
			}
		}
		render();
	}
	
	//Draws every frame
	static void render(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");
		for (int i=0; i<grid.length;i++){
			for (int j=0; j<grid[0].length;j++){
				if (grid[i][j] == true){
					System.out.print("x");
				}
				else{
					System.out.print("o");
				}
			}
			System.out.println("");
		}
	}
}
