package test;


public class Arugo {
	public static void main(String[] args){
		int[] map=new int[]{2,0,0,2};
		for(int i=0;i<4;i++){
			System.out.print(map[i]);
		}
		System.out.println("");
		int count=0;

		/*
		 * ソート*/
		for(int i=0;i<3;i++){
			if(map[i+1]!=0&&map[i]==0){
				map[i]=map[i+1];
				map[i+1]=0;
			}
		}

		for(int i=0;i<4;i++){
			System.out.print(map[i]);
		}
		System.out.println("");
		

		/*
		 * 入れ替え
		 */
		for(int i=0;i<4;i++){
			if(map[i]==0){
				count++;
			}
		}
		//すべて埋まっている（0が一つもないとき）の例外処理
		if(count==0){
			if(map[0]==map[1]&&map[0]==map[2]&&map[0]==map[3]){
				count=2;
			}else{
				count=1;
			}
		}
		//例外処理除く0の数だけ回す
		for(int i=0;i<count;i++){
			for(int j=0;j<3;j++){
				if(map[j]==0||map[j+1]==map[j]){
					map[j]+=map[j+1];
					map[j+1]=0;
				}
			}
		}
		/*
		 * 出力
		 */
		for(int i=0;i<4;i++){
			System.out.print(map[i]);
		}
	}
}
