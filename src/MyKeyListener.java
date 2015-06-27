import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyKeyListener implements KeyListener{
	int KeyCode;
	
	public void KeyPressed(KeyEvent event){
		KeyCode = event.getKeyCode();
	}
	
	public void KeyReleased(KeyEvent event){
		
	}
	
	public void keyTyped(KeyEvent event){
		
	}
}
