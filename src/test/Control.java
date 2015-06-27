package test;


public class Control {

	public int x;
	public int y;

	int[][] grid = new int[4][4];
	int[] grid2 = {2,2,2,2};

	public void test(){

		for(int i = 0; i < 4; i++){
			for(int j = 0; j< 4; j++){
				grid[i][j] = 0;
			}
		}
	}

	public void write(){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j< 4; j++){
				System.out.println(grid[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public void write2(){
		for(int i = 0; i < 4; i++){
			System.out.print(grid2[i]);
		}
		System.out.println(" ");
	}

	public int getValue(int x){

		return grid2[x];
	}


	public void moveleft(){
		int temp = 0;
		int value = 0;
		int count = 0;

		for(int i=0; i < 4; i++){
			temp = getValue(i);
			if(getValue(i) == 0){
				count++;
			}else{
				grid2[i-count] = temp;
				if(i != 0){
					grid2[i] = 0;
				}
			}
		}
/*		write2();
		for(int i=0;i<3;i++){
			if(grid2[i+1]==grid2[i]){
				grid2[i]+=grid2[i+1];
				grid2[i+1]=0;
			}
		}*/
	}

	public static void main(String args[]){
		Control c = new Control();
		c.write2();
		c.moveleft();
		c.write2();
	}

}
