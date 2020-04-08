package jicu.classloader;

public class Father {

	public static int i = 0;
	public static int m = 1;
	
	static Son son = new Son();
	{
		int i=0;
		System.out.println("Father Loader 1");
	}
	static {
		System.out.println("Father Loader 2");
	}
	public Father() {
		m = 0;
		System.out.println("Father Loader 3");
	}

}
