package jicu.classloader;

public class Son extends Father {

	public static int k = 0;
	public static int j = 1;
	{
		System.out.println("Son Loader 1");
	}
	static {
		System.out.println("Son Loader 2");
	}
	public Son() {
		j = 2;
		System.out.println("Son Loader 3");
	}

}
