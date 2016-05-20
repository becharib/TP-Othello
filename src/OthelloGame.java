import javax.swing.JOptionPane;
import java.awt.*;
/**
 * 
 * This class represents an othello game (link)
 * 
 * * @author bechari, lapchik
 *
 */
public class OthelloGame {

	public final static String black = "black";
	public final static String white = "white";
	private String player;

	/**
	 * Game board
	 */
	private Board board;

	

	/**
	 * Create a new Othello game, ready to be played (the board in its default
	 * starting configuration, white and black players are ready)
	 */
	public OthelloGame() 
	{
		this.board = new Board();

		
	}

	/**
	 * plays the game (algorithm)
	 * 
	 * <current player is black player>
	 * while (<game is not over>)
	 * 	{
	 * 		do
	 * 		{
	 *		 	<ask current player to choose a cell> 
	 *		}
	 *	 	while (<cell is not playable>)
	 *		<process cell occupation>
	 *	    if (next player can play)
	 *        switch current player
	 *	}
	 *End Game
	 * 
	 * <ask current player to choose a cell> -> on demande au joueur de jouer et on renvoie des coordonnées
	 */
	public void play() 
	{
	while (!this.gameOver())
	{
		this.player=black;
	}	
		
		
		
		
	}

	
	
	private void moveMade(int column, int row)
	{
		CellType type;
		
		
		
		if (this.player==white)
		{
			type=CellType.WHITE;
			if (this.gameOver())
			{
			 	// The game is over, and somebody won.

				JOptionPane.showMessageDialog(null, this.player + " already won!!!", 
					"Winner", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			// Make sure click event was within the board.
			else if (column <= 2 && column >= 0 && row <= 2 && row >= 0)
			{
				
				if (this.board.getCellType(column, row)!= CellType.EMPTY)
				{
					JOptionPane.showMessageDialog(null, 
						"You must choose an empty square", 
						"Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					// Add the X or O to the board.
					this.board.setCellType(column, row, type);
					
					// Since a move was made we need to refresh the display.
					repaint();

					gameOver = checkForWin(turn);
					
					// Somebody won.
					if (this.gameOver())
					{
						JOptionPane.showMessageDialog(null, this.player + " wins!!!", 
							"Winner", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
					// Keep playing.
					else
					{
						if (this.player == black) this.player = white; 
						else this.player = black;
					}
				} 
			} 
		}
		
		
		
		
		
		
		
		if (this.player==black)
		{
			type=CellType.BLACK;
			if (this.gameOver())
			{
			 	// The game is over, and somebody won.

				JOptionPane.showMessageDialog(null, this.player + " already won!!!", 
					"Winner", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			// Make sure click event was within the board.
			else if (column <= 2 && column >= 0 && row <= 2 && row >= 0)
			{
				
				if (this.board.getCellType(column, row)!= CellType.EMPTY)
				{
					JOptionPane.showMessageDialog(null, 
						"You must choose an empty square", 
						"Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					// Add the X or O to the board.
					this.board.setCellType(column, row, type);
					
					// Since a move was made we need to refresh the display.
					repaint();

					gameOver = checkForWin(turn);
					
					// Somebody won.
					if (this.gameOver())
					{
						JOptionPane.showMessageDialog(null, this.player + " wins!!!", 
							"Winner", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
					// Keep playing.
					else
					{
						if (this.player == black) this.player = white; 
						else this.player = black;
					}
				} 
			} 
		}
		
	} 
	
	
	
	
	
	
	public boolean gameOver() 
	{
		if (this.board.notfull() && !this.whiteCanPlay() && !this.blackCanPlay() )
			return true;
		if (!this.board.notfull())
			return true;
		return false;
			
	}

	
	
	/**
	 * Tells if the black player can play
	 * @return
	 */
	private boolean blackCanPlay() {
		if (this.board.nextBlackMoves().size() != 0)
			return true;
		else	
			return false;
	}
	
	/**
	 * Tells if the white player can play
	 * @return
	 */
	private boolean whiteCanPlay() {
		if (this.board.nextWhiteMoves().size() != 0)
			return true;
		else	
			return false;
	}


}
