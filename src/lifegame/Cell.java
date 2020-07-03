package lifegame;

import java.util.Random;

public class Cell {

    public static int getLength() {
		return Length;
	}
	public static void setLength(int length) {
		Length = length;
	}
	public static int getWidth() {
		return Width;
	}
	public static void setWidth(int width) {
		Width = width;
	}
	public static int[][] getA() {
		return a;
	}
	
	private static int Length=3;
    private static int Width=3;
    private static int[][] a=new int [Length][Width];
    
    Cell()
    {
    	Random random=new Random();

        for (int i = 0; i < Length; i++)
        {
            for (int j = 0; j < Width; j++)
            {
                a[i][j]=Math.random()>0.5?1:0;
            }
        }
    }
    /*public static void main(String args[]) {

        Random random=new Random();

        for (int i = 0; i < Length; i++)
        {
            for (int j = 0; j < Width; j++)
            {
                a[i][j]=Math.random()>0.5?1:0;
            }
        }*/
public void printcell() {
        for (int i = 0; i < Length; i++)
        {
            System.out.println();
            for (int j = 0; j < Width; j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
	}
}

