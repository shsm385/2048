
public class Tile {
	int x;
	int y;
	int value;
	
	public Tile(){
		int x;
		int y;
		int value;
	}
	
	public Tile(int x, int y, int value){
		
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void promote(){
		this.value *= 2; 
	}
	
	
}
