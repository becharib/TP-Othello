
import java.util.HashSet;
import java.util.Set;

import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
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
public class Board extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * default size of the board
	 */

	private static final int DEFAULT_SIZE = 8;
	public static final int SpaceSize = 40;
	/**
	 * a 2 dimensional table
	 */

	private CellType[][] game; 

	private Cell cell;

	
	/**
	 * Create a new game Board, in its default configuration
	 */
	public Board() {
		super();
		reset();
		addMouseListener(
				new MouseAdapter()
				{
					public void mousePressed(MouseEvent e)
					{
						moveMade(e.getX() / SpaceSize, e.getY() / SpaceSize);
					}
				}
						);
		}

	
	
	/**
	 * set the board in its default configuration
	 */
	public void reset()
	{
		this.game = new CellType[DEFAULT_SIZE][DEFAULT_SIZE];
		
		for (int i = 1; i < DEFAULT_SIZE; i++)
			for (int j = 1; j < DEFAULT_SIZE; j++)
				this.game[i][j] = CellType.EMPTY;

		this.game[4][4] = CellType.WHITE;
		this.game[5][4] = CellType.BLACK;
		this.game[4][5] = CellType.BLACK;
		this.game[5][5] = CellType.WHITE;
	}
	
	
	
	
	
	/**
	 * @return A boolean that tells if the board is full or not
	 */
	public boolean notfull() {

		for (int i = 1; i < DEFAULT_SIZE; i++)
			for (int j = 1; j < DEFAULT_SIZE; j++)
				if (this.game[i][j] == CellType.EMPTY)
					return true;
		return false;
	}

	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 * return the type of the cell of coordinates x and y
	 */
	public CellType getCellType(int x, int y) {
		return this.game[x][y];
		
	}
	
	public void setCellType(int x, int y,CellType type) {
		this.game[x][y]=type;
	}
	
	
	
	
	
	
	/**
	 * @param Game
	 * Scan the board and for each white cell, checks all directions for a playable cell
	 * @return A list of cell where the white player can play
	 * 
	 */

	public Set<Cell> nextWhiteMoves() {

		/**
		 * A tab of cells
		 */
		Set<Cell> listCell = new HashSet<Cell>();
		
		/**
		 * Scan the board and for each white cell, checks all directions for a playable cell
		 */
		for (int i = 1; i < DEFAULT_SIZE; i++)
		{
			for (int j = 1; j < DEFAULT_SIZE; j++)
			{

				if (this.game[i][j] == CellType.WHITE)
				{
					/**
					 * Next left playable cell
					 */
					for (int i1 = i - 1; this.game[i1][j] == CellType.BLACK && i1 >= 1; i1--)
						if (this.game[i1][j] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j);
							listCell.add(this.cell);
						}
					/**
					 * Next right playable cell
					 */		
					for (int i1 = i + 1; this.game[i1][j] == CellType.BLACK && i1 <= DEFAULT_SIZE; i1++)
						if (this.game[i1][j] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j);
							listCell.add(this.cell);
						}
					/**
					 * Next down playable cell
					 */
					for (int j1 = j - 1; this.game[i][j1] == CellType.BLACK && j1 >= 1; j1--)
						if (this.game[i][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next up playable cell
					 */
					for (int j1 = j + 1; this.game[i][j1] == CellType.BLACK && j1 <= DEFAULT_SIZE; j1++)
						if (this.game[i][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next Up-left playable cell
					 */
					for (int i1 = i - 1,j1 = j + 1; this.game[i1][j1] == CellType.BLACK && i1 >= 1 && j1<=DEFAULT_SIZE; i1--,j1++)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next Up-right playable cell
					 */
					for (int i1 = i + 1,j1 = j + 1; this.game[i1][j1] == CellType.BLACK && i1<=DEFAULT_SIZE && j1<=DEFAULT_SIZE; i1++,j1++)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next down-left playable cell
					 */
					for (int i1 = i - 1,j1 = j - 1; this.game[i1][j1] == CellType.BLACK && i1 >= 1 && j1>=1; i1--,j1--)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next down-right playable cell
					 */
					for (int i1 = i + 1,j1 = j - 1; this.game[i1][j1] == CellType.BLACK && i1<=DEFAULT_SIZE && j1 >= 1; i1++,j1--)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					}
				
				}
		}		
		return listCell;

	}

	
	/**
	 * @param Game
	 * Scan the board and for each black cell, checks all directions for a playable cell
	 * @return A list of cell where the black player can play
	 */
	public Set<Cell> nextBlackMoves() {

		/**
		 * A list of cells
		 */
		Set<Cell> listCell = new HashSet<Cell>();
		
		/**
		 * Scan the board and for each black cell, checks all directions for a playable cell
		 */
		for (int i = 1; i < DEFAULT_SIZE; i++)
		{
			for (int j = 1; j < DEFAULT_SIZE; j++)
			{

				if (this.game[i][j] == CellType.BLACK)
				{
					/**
					 * Next left playable cell
					 */
					for (int i1 = i - 1; this.game[i1][j] == CellType.WHITE && i1 >= 1; i1--)
						if (this.game[i1][j] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j);
							listCell.add(this.cell);
						}
					/**
					 * Next right playable cell
					 */		
					for (int i1 = i + 1; this.game[i1][j] == CellType.WHITE && i1 <= DEFAULT_SIZE; i1++)
						if (this.game[i1][j] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j);
							listCell.add(this.cell);
						}
					/**
					 * Next down playable cell
					 */
					for (int j1 = j - 1; this.game[i][j1] == CellType.WHITE && j1 >= 1; j1--)
						if (this.game[i][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next up playable cell
					 */
					for (int j1 = j + 1; this.game[i][j1] == CellType.WHITE && j1 <= DEFAULT_SIZE; j1++)
						if (this.game[i][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next Up-left playable cell
					 */
					for (int i1 = i - 1,j1 = j + 1; this.game[i1][j1] == CellType.WHITE && i1 >= 1 && j1<=DEFAULT_SIZE; i1--,j1++)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next Up-right playable cell
					 */
					for (int i1 = i + 1,j1 = j + 1; this.game[i1][j1] == CellType.WHITE && i1<=DEFAULT_SIZE && j1<=DEFAULT_SIZE; i1++,j1++)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next down-left playable cell
					 */
					for (int i1 = i - 1,j1 = j - 1; this.game[i1][j1] == CellType.WHITE && i1 >= 1 && j1>=1; i1--,j1--)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					/**
					 * Next down-right playable cell
					 */
					for (int i1 = i + 1,j1 = j - 1; this.game[i1][j1] == CellType.WHITE && i1<=DEFAULT_SIZE && j1 >= 1; i1++,j1--)
						if (this.game[i1][j1] == CellType.EMPTY)
						{
							this.cell = new Cell(i1, j1);
							listCell.add(this.cell);
						}
					}
				
				}
		}		
		return listCell;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}