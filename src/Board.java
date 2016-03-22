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
	 * default width
	 */
	
	private static final int DEFAULT_WIDTH = 8;
	
	/**
	 * default length
	 */
	
	private static final int DEFAULT_LENGTH = 8;
	
	/**
	 * the value of an empty checkbox 
	 */
	
	private final static int EMPTY_CHECKBOX = 0;
	
	/**
	 * the value of a checkbox with a white pawn
	 */
	
	private final static int WHITE_PAWN = 1;
	
	/**
	 * the value of a chekcbox with a black pawn
	 */
	
	private final static int BLACK_PAWN = 2;
	
	/**
	 * a 2 dimensional table
	 */
	
	private int[][] newBoards;

	
	/**
	 * Create the table
	 */
	public Board() 
	{
		this.newBoards = new Board[DEFAULT_LENGTH][DEFAULT_WIDTH];
		
	}
}
