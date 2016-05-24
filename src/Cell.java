/**
 * 
 */

/**
 * @author becharib
 *It is a cell with coordinates and a state: black, white or empty
 */
public class Cell {
	/**
	 * the  state of the cell
	 */
	public CellType cellState;
	
	
	/**
	 * easting
	 */
	private final int x;
    /**
     * northing
     */
    private final int y;

    /**
     * @param x
     * @param y
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        
    }


    /**
     * @return easting
     */
    public int getX() {
        return this.x;
    }

    /**
     * @return northing
     */
    public int getY() {
        return this.y;
    }

}