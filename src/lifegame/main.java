package lifegame;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map;
		map=new Map();
		map.printcell();
		System.out.println();
		map.getNeighbors();
		map.nextWorld();
		map.printcell();
		System.out.println();
		map.getNeighbors();
		map.nextWorld();
		map.printcell();
	}

}
