/**
 * 
 * This class represents an othello game (link)
 * 
 * * @author bechari, lapchik
 *
 */
public class OthelloGame {



	/**
	 * Game board
	 */
	private Board board;

	private Player blackPlayer;

	private Player whitePlayer;

	/**
	 * Create a new Othello game, ready to be played (the board in its default
	 * starting configuration, white and black players are ready)
	 */
	public OthelloGame() 
	{
		this.board = new Board();
		this.blackPlayer = new Player();
		this.whitePlayer = new Player();

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
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private boolean gameOver() 
	{
		if (this.board.notfull() && !blackPlayer.canPlay() && !whitePlayer.canPlay() )
			return true;
		return false;
			
	}
}
