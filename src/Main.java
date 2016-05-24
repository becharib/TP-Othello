import javax.swing.JFrame;

/**
 * 
 * @author bechari
 * @author lapchik
 *
 */
public class Main {

	/**
	 * launch a new game
	 */
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
        
	    
	    fenetre.setTitle("Othello Game");	
	    fenetre.setSize(400, 400);
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	    fenetre.setVisible(true);
	    fenetre.setContentPane(new Panneau());
	    
	    OthelloGame othellogame = new OthelloGame();
		othellogame.play();	
		
	}
	
	
	
	
	

}
