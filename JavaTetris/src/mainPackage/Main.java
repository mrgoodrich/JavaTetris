package mainPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main extends JComponent{
	
	//Init variables for main class
	static long start = 1;
	static long currentFrame = 0;
	static long mostRecentFrameUsed = 0;
	static long frameSmall = 0;
	static boolean[][] grid;
	static boolean initialDraw = false;
	
	 //GUI Related
	static JFrame frame = new JFrame();
	Random rand = new Random();
	float red = rand.nextFloat();
	float green = rand.nextFloat();
	float blue = rand.nextFloat();
	Color randomColor = new Color(red,green,blue);
	
	//Init objects of other classes
//	static Board board = new Board();
//	static Shape shape  = new Shape(1);
//	static Scoreboard scoreboard = new Scoreboard();
	
	//Main method
	public static void main(String[] args){

		//Set values before frames start running
		grid = new boolean[15][10]; //ADD board.getWidth()][board.getHeight()
		for (int i=0; i<grid.length; i++){
			for (int j=0; j<grid[0].length;j++){
				grid[i][j] = false;
			}
		}
		
		//Configure basic GUI stuff
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    frame.getContentPane().add(new Main());
		frame.setVisible(true);
		
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
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		red = rand.nextFloat();
		green = rand.nextFloat();
		blue = rand.nextFloat();
		randomColor = new Color(red,green,blue);
		g2.setPaint(randomColor);
		g2.fill(new Rectangle2D.Double(10, 10, 200, 200));
	}
	
	//Draws every frame
	static void render(){
		frame.repaint();
		
//		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");
//		for (int i=0; i<grid.length;i++){
//			for (int j=0; j<grid[0].length;j++){
//				if (grid[i][j] == true){
//					System.out.print("x");
//				}
//				else{
//					System.out.print("o");
//				}
//			}
//			System.out.println("");
//		}
	}
}
