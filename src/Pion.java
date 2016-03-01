/**
 * @author bechari
 * @author lapchik
 *
 */
public class Pion 
{
	public boolean color;
	public final int x;
	public final int y;
	
	public Pion(int x0,int y0)
	{
		this.x=x0;
		this.y=y0;
	}
	
	public Pion(int x0, int y0, boolean color0)
	{
		this.x=x0;
		this.y=y0;
		this.color=color0;
	}
	
	public void Retourner()
	{
		this.color=!this.color;
	}
	
}
