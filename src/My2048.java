import javax.swing.JFrame;

public class My2048 extends JFrame /*implements WindowListener*/{

	
	public static void main(String[] args){
		new My2048();
	}
	
	
	
	public My2048(){
		JFrame mainFrame = new JFrame("2048");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(800, 600);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true); 
	}	

}
