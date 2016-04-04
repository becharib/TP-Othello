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
	 * the value of an empty checkbox 
	 */
	private static final int EMPTY = 0;
	
	/**
	 * the value of a checkbox with a white pawn
	 */
	
	private static final int WHITE = 1;
	
	/**
	 * the value of a checkbox with a black pawn
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
}
