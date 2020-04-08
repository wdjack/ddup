package jicu.genericity;

public class Coords<T extends TwoD> {

	T[] coords;
	public Coords(T[] ob) {
		// TODO Auto-generated constructor stub
		coords = ob;
	}
	static void showXY(Coords<?> c) {
		System.out.println("X Y Coordinates: ");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x+"****"+c.coords[i].y);
			System.out.println();
		}
	}
	//ÓÐ½çÍ¨Åä·û
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X Y Coordinates: ");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x+"****"+c.coords[i].y+"****"+c.coords[i].z);
			System.out.println();
		}
	}

}
