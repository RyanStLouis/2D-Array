import java.util.Random;

public class HelloWorldz {
	public static void main(String[] args) {
        
	    Random ran = new Random();
	    
	    int [][]grid= new int[4][6];
	    
	    for (int rows = 0; rows < 4; rows++) 
	    {
	        for (int columns = 0; columns < 6; columns++) 
	        {
	            grid[rows][columns] = ran.nextInt(100);
	    		System.out.println(grid[rows][columns]);
	    	}
	    }
}
}
