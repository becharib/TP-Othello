import java.util.ArrayList;


public class Player {
	
	
	/**
	 * 
	 */
	private String color;
	
	
	ArrayList<Cell> nextWhiteMoves = Board.nextWhiteMoves();
	
	/**
	 * 
	 * @param color
	 */
	public Player(String color) {
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}





		
		
		return false;
		
	}






	

}

//private boolean gameOver() 
//{
//	if (this.board.notfull() && !blackPlayer.canPlay() && !whitePlayer.canPlay() )
//		return true;
//	return false;
//		
//}