
import java.util.ArrayList;

/**		 1  2  3  4  5  6  7  8
 * 		________________________
 * 1	|0| 0| 0| 0| 0| 0| 0| 0|
 * 2	|0| 0| 0| 0| 0| 0| 0| 0|
 * 3	|0| 0| 0| 0| 0| 0| 0| 0|	
 * 4	|0| 0| 0| 1| 2| 0| 0| 0|
 * 5	|0| 0| 0| 2| 1| 0| 0| 0|	
 * 6	|0| 0| 0| 0| 0| 0| 0| 0|
 * 7    |0| 0| 0| 0| 0| 0| 0| 0|
 * 8	|0| 0| 0| 0| 0| 0| 0| 0|
 * 		-----------------------
 * The model of the beginning of the game
 * 
 */



/**
 * @author becharib
 *
 */
/**
 * 
 * It's a board 8*8 of pawns 
 *
 */
public class Board
{

	/**
	 * the value of an empty cell 
	 */
	private static final int EMPTY = 0;
	
	/**
	 * the value of a cell with a white pawn
	 */
	
	private static final int WHITE = 1;
	
	/**
	 * the value of a cell with a black pawn
	 */
	
	private static final int BLACK = 2;
	
	
	
	/**
	 * default size of the board
	 */
	
	private static final int DEFAULT_SIZE = 8;
	
	
	/**
	 * a 2 dimensional table
	 */
	
	final static int Game[][] = new int[DEFAULT_SIZE][DEFAULT_SIZE];

	
	
	private Cell cell;
	
	

	
	
	
	
	/**
	 * Create a new game Board, in its default configuration
	 */
	public Board() 
	{
		for (int i=1; i<DEFAULT_SIZE; i++)       
	         for (int j=1; j<DEFAULT_SIZE; j++)
	            Game[i][j] = EMPTY;

		
		 Game[4][4] = WHITE;          
	     Game[5][4] = BLACK;
	     Game[4][5] = BLACK;
	     Game[5][5] = WHITE;
	     
	}


	/**
	 * @return
	 * Tells if the board is full or not
	 */
	public boolean notfull() {
		
		for (int i=1; i<DEFAULT_SIZE; i++)       
	         for (int j=1; j<DEFAULT_SIZE; j++)
	        	 if (Game[i][j] == EMPTY)
	        		 return true;
		return false;
	}
	
	
	
	
	
	/**
	 * @param Game 
	 * @return
	 */
	
	
	public ArrayList<Cell> nextWhiteMoves(int Game[][]) {
		
		ArrayList<Cell> listCell = new ArrayList<Cell>();
		for (int i=1; i<DEFAULT_SIZE; i++)       
	         for (int j=1; j<DEFAULT_SIZE; j++)
	        	 
	        	 if (Game[i][j] == WHITE)
	        		 for (int i1=i; Game[i][j]==BLACK && i1>=1; i1--)
	        			 if(Game[i1][j]==EMPTY)
	        				 this.cell = new Cell(i1, j);
							 listCell.add(cell);
					
					 for (int i2=i; Game[i][j]==BLACK && i2>=1; i2--)
			        	  
						 if(Game[i1][j]==EMPTY)
			        			this.cell = new Cell(i2, j);
								listCell.add(cell);							 
							 
							 
							 
							 
		return listCell;
							 
							 
	        			 
	        			 
	        		 	
		
		
		
		
		
	}




	

	

}

