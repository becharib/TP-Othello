/**
 * 
 */

/**
 * @author becharib
 *
 */
public class Cell {
	
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