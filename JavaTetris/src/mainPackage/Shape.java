package mainPackage;
public class Shape
{
	boolean topLeft;
	boolean top;
	boolean topRight;
	boolean midLeft;
	boolean mid;
	boolean midRight;
	boolean botLeft;
	boolean bot;
	boolean botRight;
	
	//Constructor that takes a random number from generator 1-7
	public Shape(int num)
	{
		//T shape
		if(num == 1)
		{
			topLeft = false;
			top = true;
			topRight = false;
			midLeft = true;
			mid = true;
			midRight = true;
			botLeft = false;
			bot = false;
			botRight = false;	 
		}
		
		//square
		if(num == 2)
		{
			topLeft = true;
			top = true;
			topRight = false;
			midLeft = true;
			mid = true;
			midRight = false;
			botLeft = false;
			bot = false;
			botRight = false;	 
		}
		
		//Z
		if(num == 3)
		{
			topLeft = true;
			top = true;
			topRight = false;
			midLeft = false;
			mid = true;
			midRight = true;
			botLeft = false;
			bot = false;
			botRight = false;	 
		}
		
		//L
		if(num == 4)
		{
			topLeft = false;
			top = true;
			topRight = false;
			midLeft = false;
			mid = true;
			midRight = false;
			botLeft = false;
			bot = true;
			botRight = true;	 
		}
		
		//backwards L
		if(num == 5)
		{
			topLeft = false;
			top = true;
			topRight = false;
			midLeft = false;
			mid = true;
			midRight = false;
			botLeft = true;
			bot = true;
			botRight = false;	 
		}
		
		//line
		if(num == 6)
		{
			topLeft = false;
			top = false;
			topRight = false;
			midLeft = true;
			mid = true;
			midRight = true;
			botLeft = false;
			bot = false;
			botRight = false;	 
		}
		
		//backwards Z
		if(num == 7)
		{
			topLeft = false;
			top = true;
			topRight = true;
			midLeft = true;
			mid = true;
			midRight = false;
			botLeft = false;
			bot = false;
			botRight = false;	 
		}	
	}
}
