package lifegame;

public class Map {

	final int SIZE=3;
	private int neighbors[][]=new int [SIZE][SIZE];
	private int table[][]=new int [SIZE][SIZE];
	Map()
	{
		Cell cell;
		cell=new Cell();
		table=cell.getA();
	}
	public void getNeighbors()
	{
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				if(i-1>=0 && j-1>=0 && table[i-1][j-1]==1) neighbors[i][j]++;//左上
				if(i-1>=0 && table[i-1][j]==1) neighbors[i][j]++;			//左
				if(i-1>=0 && j+1<SIZE && table[i-1][j+1]==1) neighbors[i][j]++;//左下
				if(j-1>=0 && table[i][j-1]==1) neighbors[i][j]++;			//上
				if(j+1<SIZE&& table[i][j+1]==1) neighbors[i][j]++;			//下
				if(i+1<SIZE && table[i+1][j]==1) neighbors[i][j]++;         //右
				if(i+1<SIZE && j+1<SIZE && table[i+1][j+1]==1) neighbors[i][j]++;//右下
				if(i+1<SIZE && j-1>=0 && table[i+1][j-1]==1) neighbors[i][j]++; //右上
			}
		}
	}
	
	public void nextWorld()
	{
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				int y;
				y=neighbors[i][j];
				switch(y)
				{
				case 0:
				case 1:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
					table[i][j]=0;
					break;
				case 2:
					break;
				case 3:
					table[i][j]=1;
				}
			}
		}
	}
	public void printcell() {
        for (int i = 0; i < SIZE; i++)
        {
            System.out.println();
            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(table[i][j]+" ");
            }
        }
	}
}

