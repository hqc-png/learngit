package lifegame;

public class main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
