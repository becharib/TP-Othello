/**
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
	 * default length
	 */
	private static final int DEFAULT_LENGTH = 7;
	
	/**
	 * default width
	 */
	private static final int DEFAULT_WIDTH = 7;

	/**
	 * a 2 dimensional table of pawns
	 */
	
	private Pawn[][] tableauPawns;
	
	/**
	 * Create the table
	 */
	public Board() 
	{
		this.tableauPawns = new Pawn[DEFAULT_LENGTH][DEFAULT_WIDTH];
	}
	
}
