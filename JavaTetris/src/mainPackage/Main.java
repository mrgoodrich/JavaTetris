package mainPackage;

public class Main {
	//Init variables for main class
	static int start = 1;
	static int currentFrame = 0;
	static int mostRecentFrameUsed = 0;
	static int frameSmall = 0;
	static boolean[][] grid;
	
	//Init objects of other classes
	static Board board = new Board();
	static Shape shape  = new Shape();
	static Scoreboard scoreboard = new Scoreboard();
	
	//Main method
	public static void main(String[] args){
		//Set values before frames start running
		grid = new boolean[10][20]; //ADD board.getWidth()][board.getHeight()
		for (int i=0; i<grid.length; i++){
			for (int j=0; j<grid[0].length;j++){
				grid[i][j] = false;
			}
		}
		
		//Runs frame
		while (start==1){  
			frameSmall = currentFrame/100000;
			
			if ((frameSmall != mostRecentFrameUsed) && (frameSmall % 3 == 0)){
				update();
				mostRecentFrameUsed = frameSmall;
			}
			currentFrame++;
		}
	}
	
	//Updates every frame
	static void update(){
		render();
	}
	
	//Draws every frame
	static void render(){
//		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");
//		for (int i=0; i<grid[0].length;i++){
//			for (int j=0; j<grid.length;j++){
//				if (grid[j][i] == true){
//					System.out.print("x");
//				}
//				else{
//					System.out.print("o");
//				}
//			}
//			System.out.println("");
//		}
		System.out.print("hi");
	}
}
