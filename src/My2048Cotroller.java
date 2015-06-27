
public class My2048Cotroller {
	My2048Model model;
	My2048Panel panel;
	My2048 frame;

	public My2048Cotroller(My2048Model model, My2048Panel panel){
		model = this.model;
		panel = this.panel;
	}

	public void newGame(){

	}

	public void didType(int keyCode){
		int temp = 0, val = 0;
		int[][] grid = new int[4][4];
		for(int y = 1; y < 5; y++){
			for(int x = 1; x < 5; x++){
				val = model.getValue(x, y);
				temp = val;
				while(true){
					if(grid[x-1][y] == -1){
						grid[x][y] = temp;
						break;
					}else if(grid[x-1][y] == 0){
						grid[x][y] = 0;
						grid[x-1][y] = val;
						break;
					}else if(grid[x-1][y] == temp){
						grid[x][y] = 0;
						grid[x-1][y] = temp*2;
						break;
					}else{
						break;
					}
				}

			}
		}
	}


}
